package com.bridgelabz;

public class MoodAnalyzer {
    public String analyzemood(String thought) {

        if (thought.contains("I am in sad mood")) {

            return "SAD";
        } else if (thought.contains("I am in happy mood"))

            return "HAPPY";
        return null;
    }

}
