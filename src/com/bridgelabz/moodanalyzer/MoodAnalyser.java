package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){}
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyserException
    {
        this.message = message;
        return analyseMood();

    }
    public String analyseMood()throws MoodAnalyserException {
        try
        {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.emptyEnter,"Please Enter Valid Data");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e)
        {
    throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.nullEnter,"Please Enter Valid Data");
        }
    }
}
