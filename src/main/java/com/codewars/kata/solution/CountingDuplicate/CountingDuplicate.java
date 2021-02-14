package main.java.com.codewars.kata.solution.CountingDuplicate;

public class CountingDuplicate {

    public static int duplicateCount(String inputString){

        int duplicateCounter = 0;
        inputString = inputString.toLowerCase();

        while (inputString.length()>0){

            String firstChar = inputString.substring(0,1);  //first character
            inputString = inputString.substring(1);         //remaining string

            if (inputString.contains(firstChar)) duplicateCounter++;
            inputString = inputString.replace(firstChar,"");    //trim first char

        }
        return duplicateCounter;
    }
}
