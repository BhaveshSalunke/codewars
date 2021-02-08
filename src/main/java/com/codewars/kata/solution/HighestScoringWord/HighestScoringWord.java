package main.java.com.codewars.kata.solution.HighestScoringWord;

import java.util.HashMap;

public class HighestScoringWord {

    public static String high(String s) {

        String[] stringArray = s.split("\\s");

        HashMap<Character, Integer> charWeight = new HashMap<>();

        charWeight.put('a',1);
        charWeight.put('b',2);
        charWeight.put('c',3);
        charWeight.put('d',4);
        charWeight.put('e',5);
        charWeight.put('f',6);
        charWeight.put('g',7);
        charWeight.put('h',8);
        charWeight.put('i',9);
        charWeight.put('j',10);
        charWeight.put('k',11);
        charWeight.put('l',12);
        charWeight.put('m',13);

        charWeight.put('n',14);
        charWeight.put('o',15);
        charWeight.put('p',16);
        charWeight.put('q',17);
        charWeight.put('r',18);
        charWeight.put('s',19);
        charWeight.put('t',20);
        charWeight.put('u',21);
        charWeight.put('v',22);
        charWeight.put('w',23);
        charWeight.put('x',24);
        charWeight.put('y',25);
        charWeight.put('z',26);

        int index = 0;
        int higestScoringString = Integer.MIN_VALUE;

        for (int i = 0; i < stringArray.length; i++) {

            int sum = 0;
            int weight = 0;
            for (int j = 0; j < stringArray[i].length(); j++) {
                weight = charWeight.get(stringArray[i].charAt(j));
                sum += weight;
            }

            if (sum > higestScoringString) {
                higestScoringString = sum;
                index = i;
            }
        }

        return stringArray[index];
    }

}
