package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
        String mood = null;
        try
        {
            mood = moodAnalyser.analyseMood();
        }
        catch(MoodAnalyserException exception)
        {
            exception.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessageWhenNotSad_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy Message");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException exception) {
            exception.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMood_ShouldReturnException()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        try
        {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            moodAnalyser.analyseMood();
        }
        catch(MoodAnalyserException exception) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.nullEnter, exception.type);
        }
    }

    @Test
    public void givenEmptyMood_ShouldReturnException()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try
        {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            moodAnalyser.analyseMood();
        }
        catch(MoodAnalyserException exception) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.emptyEnter, exception.type);
        }
    }
}
