package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message){
        this.message = message;

    }
    public String analysemood(String message){
        this.message = message;
        return analysemood();
    }

    private String analysemood() {
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
