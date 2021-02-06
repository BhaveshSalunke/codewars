package main.java.com.codewars.kata.solution.MyHeadIsAtTheWrongEnd;

public class MyHeadIsAtTheWrongEnd {

    public static String[] fixTheMeerkat(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        return arr;

    }
}
