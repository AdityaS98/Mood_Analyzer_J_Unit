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


}

