package main.java.com.codewars.kata.solution.GiveMeDiamond;

public class GiveMeDiamond {

    public static String print(int n) {

        if(n < 0 || n%2==0) return null;

        else {

            StringBuilder diamond = new StringBuilder();
            for( int i = 0; i <= n; i++) {                               //total length of diamond

                if( i%2==1) {
                    for( int k = (n-i)/2; k > 0; k--) {
                        diamond.append(" ");
                    }
                    for(int j = 0; j < i; j++) diamond.append("*");         //iterate till that odd number
                    diamond.append("\n");
                }
            }
            for (int i = n-1; i > 0; i--) {

                if ( i%2==1) {

                    for (int k = (n-i)/2; k > 0; k--) {
                        diamond.append(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        diamond.append("*");
                    }
                    diamond.append("\n");
                }

            }

            return diamond.toString();
        }

    }

}
