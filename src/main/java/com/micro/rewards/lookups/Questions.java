package com.micro.rewards.lookups;

import java.util.Random;

public class Questions {

    public static final String WHERE = "Where ";
    public static final String AND = "And ";
    public static final String OR = "Or ";
    public static final String NOT = "Not ";
    public static final String IS = "is ";
    public static final String WHAT = "What ";
    public static final String WHEN = "When ";
    public static final String THEN = "Then ";
    public static final String HOW = "How ";
    public static final String WHY = "Why ";
    public static final String WAS = "was ";
    public static final String MADE = "made ";

    static Random random = new Random();

    public static String getWhereWhatHow() {
        int x = random.nextInt(4);
        return switch (x) {
            case 0 -> WHY;
            case 1 -> WHERE;
            case 2 -> WHAT;
            case 3 -> HOW;
            default -> WHERE;
        };
    }

}
