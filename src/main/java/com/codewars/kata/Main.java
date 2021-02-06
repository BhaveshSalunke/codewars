package main.java.com.codewars.kata;

import main.java.com.codewars.kata.solution.EqualSidesOfArray.EqualSidesOfAnArray;
import main.java.com.codewars.kata.solution.JadenCasingString.JadenCasingString;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World");

        Stack<Integer>  ball = new Stack<>();
        ball.push(2);
        ball.push(4);
        ball.push(1);

        System.out.println("isEmpty: "+ball.empty());
        System.out.println(ball);

        System.out.println("Peek: "+ball.peek());
        System.out.println("Search: "+ball.search(5));
        System.out.println("Thats cool right");


    }
}
