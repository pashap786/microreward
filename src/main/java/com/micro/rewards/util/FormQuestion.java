package com.micro.rewards.util;

import com.micro.rewards.lookups.Questions;

import java.util.Random;

public class FormQuestion {

    Random random = new Random();

    public static String getQuestion(String questionTarget) {
        String whereWhatHow = Questions.getWhereWhatHow();

        if (whereWhatHow.equalsIgnoreCase(Questions.WHERE)) {
            return whereWhatHow+Questions.IS+questionTarget;
        } else if (whereWhatHow.equalsIgnoreCase(Questions.WHEN)) {
            return questionTarget+Questions.WAS+questionTarget;
        } else if (whereWhatHow.equalsIgnoreCase(Questions.THEN)) {
            return whereWhatHow+questionTarget;
        } else if (whereWhatHow.equalsIgnoreCase(Questions.HOW)) {
            return whereWhatHow+Questions.WAS+questionTarget+Questions.MADE;
        } else if(whereWhatHow.equalsIgnoreCase(Questions.WHAT)) {
            return whereWhatHow+Questions.IS+questionTarget;
        }

        return Questions.WHY+questionTarget;
    }

}
