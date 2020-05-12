package com.company;

public class TrueFalse extends Question {
    private boolean correctAnswer;
    private boolean selectedAnswer;

    public TrueFalse(String prompt, boolean correctAnswer) {
        super(prompt);
        this.correctAnswer = correctAnswer;
    }

    public void displayPotentialAnswers() {
        System.out.println("Enter True or False");
    }

    public boolean isCorrect() {
        return selectedAnswer == correctAnswer;
    }

    public void setSelectedAnswer(boolean selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }
}
