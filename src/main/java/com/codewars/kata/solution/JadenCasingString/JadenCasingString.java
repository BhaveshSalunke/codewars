package main.java.com.codewars.kata.solution.JadenCasingString;

public class JadenCasingString {
    public String toJadenCase(String phrase) {

        if(phrase == null || phrase.isEmpty()) return null; //returning null  for null or empty string


        char[] charPhrase = phrase.toCharArray();
        boolean whiteSpace = true;

        for( int i = 0; i < charPhrase.length; i++) {

            if(Character.isLetter(charPhrase[i])){

                if(whiteSpace) {
                    charPhrase[i] = Character.toUpperCase(charPhrase[i]);
                    whiteSpace = false;

                }

            }
            else whiteSpace = true;
        }
        phrase = String.valueOf(charPhrase);

        return phrase;
    }
}
