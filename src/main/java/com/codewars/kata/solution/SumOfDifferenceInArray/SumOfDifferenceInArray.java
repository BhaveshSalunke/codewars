package main.java.com.codewars.kata.solution.SumOfDifferenceInArray;

public class SumOfDifferenceInArray {

    public static int sumOfDifferences(int[] arr) {

        if(arr.length<2) return 0;

        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            }
            if (arr[i] < MIN) {
                MIN = arr[i];
            }

        }

        return MAX-MIN;
    }
}
