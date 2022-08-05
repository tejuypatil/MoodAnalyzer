package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {
    private String message;

    //Default Constructor
    public MoodAnalyser() {
    }

    //Parametrised Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analysemood(String message) {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
