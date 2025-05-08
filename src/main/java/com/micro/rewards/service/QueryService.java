package com.micro.rewards.service;

import com.micro.rewards.lookups.Places;
import com.micro.rewards.util.FormQuestion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.awt.*;
import java.util.Random;

import com.micro.rewards.util.MrRoboto;

@Slf4j
@Service
public class QueryService {

    private FakerService fakerService;

    @Autowired
    public QueryService(FakerService fakerService) {
        this.fakerService = fakerService;
    }

    private Random random = new Random();

    public String getQuery() {
        int x = random.nextInt(0, 3);
        log.info("CHOOSING QUERY TYPE {}", x);
        String query = "";
        if (x == 0) {
            query = fakerService.getAnAnimal();
        } else if (x == 1) {
            query = fakerService.getAName();
        } else if (x == 2) {
            query = fakerService.getAddress();
        } else if (x == 3) {
            query = FormQuestion.getQuestion(Places.getPlace());
        } else {
            query = fakerService.getWeird();
        }
        return query;
    }

    public String queryBing() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        String query = getQuery();
        log.info("Query string: {}", query);
        MrRoboto.typeQuery(robot, query);
        return "DONE "+query;
    }

    public void getBingQuiz() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        MrRoboto.typeQuery(robot, "Bing Quiz");
    }

}
