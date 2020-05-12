package com.company;

import java.util.HashMap;
import java.util.Map;

public class MultipleChoice extends Question {
    private HashMap<String, String> potentialAnswers;
    private String correctAnswerPrefix;
    private String selectedAnswerPrefix;
    public MultipleChoice(String prompt, HashMap<String, String> potentialAnswers, String correctAnswerPrefix) {
        super(prompt);
        this.potentialAnswers = potentialAnswers;
        this.correctAnswerPrefix = correctAnswerPrefix;
    }

    public void displayPotentialAnswers() {
        for (Map.Entry<String, String> answer : potentialAnswers.entrySet()) {
            System.out.println(answer.getKey() + ": " + answer.getValue());
        }
    }

    public boolean isCorrect() {
        return selectedAnswerPrefix == correctAnswerPrefix;
    }

    public void setSelectedAnswerPrefix(String selectedAnswerPrefix) {
        this.selectedAnswerPrefix = selectedAnswerPrefix;
    }
}
