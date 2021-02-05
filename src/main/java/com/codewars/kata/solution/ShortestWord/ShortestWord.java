package main.java.com.codewars.kata.solution.ShortestWord;

public class ShortestWord {

    public static int findShort(String s) {

        String[] stringArray = s.split("\\s");
        int minLength = stringArray[0].length();

        for(int i = 0; i < stringArray.length; i++) {

            if(stringArray[i].length() < minLength) {
                minLength = stringArray[i].length();
            }
        }

        return minLength;

    }
}
