package com.micro.rewards.util;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MrRoboto {

    public static void clickez() {
        try {
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(200);
            // Simulate a left mouse button release
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }   catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void typeQuery(Robot robot, String query) throws InterruptedException {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        // Simulate a left mouse button release
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        // Clear the input box first
        selectAllAndDelete(robot, query);

        // Type the query
        copyToClipboard(query);
        pasteClipboard(robot);

        // Press Enter
        Thread.sleep(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("Searched: " + query);
    }

    private static void copyToClipboard(String text) {
        StringSelection selection = new StringSelection(text);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    }

    private static void pasteClipboard(Robot robot) throws InterruptedException {
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
    }

    private static void selectAllAndDelete(Robot robot, String query) throws InterruptedException {
        for(int y=0; y<query.length(); y++) {
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
        }
    }

}
