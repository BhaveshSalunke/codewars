package main.java.com.codewars.kata.solution.EqualSidesOfArray;

public class EqualSidesOfAnArray {


    public static int findEvenIndex(int[] arr) {
        int arrSize = arr.length;
        for (int i = 0; i < arrSize; i++) {

            int sumRight = 0;
            int sumLeft = 0;

            for (int j = arrSize - 1; j > i; j--) sumRight += arr[j];

            for (int k = 0; k < i; k++) sumLeft += arr[k];

            if (sumRight == sumLeft) return i;

        }

        return -1;
    }
}
