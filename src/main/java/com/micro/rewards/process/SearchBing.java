package com.micro.rewards.process;

import com.micro.rewards.service.QueryService;
import com.micro.rewards.util.MrRoboto;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.Random;

@Slf4j
@Configuration
public class SearchBing {

    @Autowired
    private QueryService queryService;

    @PostConstruct
    public void runAfterStart() {
        try {
            log.info("Desktop supported {}", Desktop.isDesktopSupported());

            searchBing();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Error {}", e.getMessage());
        }
    }
    String edgePath = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
    Random random = new Random();
    private void searchBing() throws Exception {
        queryService.getBingQuiz();
        for (int x = 20; x > 0; x--) {
            long randomSleep = random.nextLong(1500, 20000);
            log.info("Query try # {} Delay {}", x, randomSleep);

            inNewWindow(randomSleep, queryService.getQuery());
            MrRoboto.clickez();
            queryService.queryBing();

            Thread.sleep(randomSleep);
        }
    }

    private void inNewWindow(long interval, String query) throws Exception {
        String url = "https://www.bing.com/search?q=" + query.replace(" ", "+")+"&form=TSASDS";
        try {
            new ProcessBuilder(edgePath, url).start();
            Thread.sleep(interval); // Slight delay between opening tabs
        } catch (IOException | InterruptedException e) {
           log.error(e.getMessage());
        }
    }
}
