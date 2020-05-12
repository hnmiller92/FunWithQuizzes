package com.company;

public abstract class Question {
    private String prompt;

    public Question(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    private void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String askQuestion() {
        return prompt;
    }
}
K