package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test

    public void moodAnalyserShouldReturnSad() {
        String str = moodAnalyzer.analyzemood("I am in sad mood ");
        Assertions.assertEquals("SAD", str);
        Assertions.assertNotEquals("sad", str);


    }

    @Test
    public void moodAnalyserShouldReturnHappy() {

        String str = moodAnalyzer.analyzemood("I am in happy mood");
        Assertions.assertEquals("HAPPY", str);
        Assertions.assertNotEquals("Happy", str);


    }

    @Test
    public void moodAnalyserUsingConstructorandPassingTheSadMessage() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        Assertions.assertEquals("SAD", moodAnalyzer.moodAnalyzerConstructor());
    }

    @Test
    public void moodAnalyserUsingConstructorandPassingTheHappyMessage() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
        Assertions.assertEquals("HAPPY", moodAnalyzer.moodAnalyzerConstructor());
    }

    @Test
    public void moodAnalyzerUsingExceptionHandling() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);

        Assertions.assertEquals("HAPPY", moodAnalyzer.moodAnalyzerConstructorUsingTryCatch());

    }


}

