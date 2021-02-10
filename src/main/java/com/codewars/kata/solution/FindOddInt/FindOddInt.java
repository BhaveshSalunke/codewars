package main.java.com.codewars.kata.solution.FindOddInt;

public class FindOddInt {

    public static int findIt(int[] a) {

        for (int value : a) {

            int count = 0;
            for (int i : a) if (value == i) count++;

            if (count % 2 == 1) return value;
        }
        return 0;
    }
}

