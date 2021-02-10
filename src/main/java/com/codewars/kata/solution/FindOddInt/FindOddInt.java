package main.java.com.codewars.kata.solution.FindOddInt;

public class FindOddInt {

        public static int findIt(int[] a) {

            int integer = 0;
           for(int i=0; i<a.length;i++) {

                int count = 0;
                int num = a[i];
                for(int j=0;j<a.length;j++) {
                    if(num == a[j]) count++;
                }


                if(count%2==1) {
                    return num;
                }
            }
            return 0;
        }
    }

