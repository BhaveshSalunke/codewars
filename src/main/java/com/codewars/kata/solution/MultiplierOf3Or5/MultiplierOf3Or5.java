package main.java.com.codewars.kata.solution.MultiplierOf3Or5;

public class MultiplierOf3Or5 {

    public int solution(int number) {

        int sum=0;
        for(int i=1; i<number; i++){
            if(i%3==0 || i%5==0) {
                sum+=i;
            }
        }

        return sum;
    }
}
