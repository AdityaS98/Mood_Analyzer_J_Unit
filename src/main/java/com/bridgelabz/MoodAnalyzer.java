package com.bridgelabz;

public class MoodAnalyzer {

    String thoughts;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String thoughts) {
        this.thoughts = thoughts;
    }

    public String analyzemood(String thought) {

        if (thought.contains("I am in sad mood")) {

            return "SAD";
        } else if (thought.contains("I am in happy mood"))

            return "HAPPY";
        return null;
    }

    public String moodAnalyzerConstructor() {
        if (thoughts.contains("I am in Sad mood")) {
            return "SAD";

        }
        return null;
    }
}
