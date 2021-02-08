package main.java.com.codewars.kata.solution.HighestScoringWord;

import java.util.Scanner;

public class HighestScoringWord {

    public static String high(String s) {

        int highestScore = Integer.MIN_VALUE;
        String highestScorer = "";
        for (String word: s.split("\\s")) {

            int weight = 0;
            for (char character: word.toCharArray()) {
                weight += character-'a'+1;
            }
            if (weight>highestScore) {
                highestScore = weight;
                highestScorer = word;
            }
        }

        return highestScorer;
    }

}
