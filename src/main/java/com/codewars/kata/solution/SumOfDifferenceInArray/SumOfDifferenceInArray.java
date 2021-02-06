package main.java.com.codewars.kata.solution.SumOfDifferenceInArray;

public class SumOfDifferenceInArray {

    public static int sumOfDifferences(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {

                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        int sum = 0; //Stores final output
        /* 
        * arr [10,2,1]
        * (10-2)+(2-1)
        * */
        for (int i = 0; i < length - 1; i++) {
            
            sum += arr[i] - arr[i+1];
            
        }

        return sum;
    }
}
