package com.bridgelabz.moodanalyzer;

public class MoodAnalyserException extends Exception{
   // String a=null; // null
    //String b=""; // empty
    //String c=new String(); // empty
    enum ExceptionType{
        nullEnter,emptyEnter
    }
    ExceptionType type;
    public MoodAnalyserException(ExceptionType type,String message)
    {
        super(message);
        this.type = type;
    }
}
