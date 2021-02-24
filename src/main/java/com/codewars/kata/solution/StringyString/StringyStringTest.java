package main.java.com.codewars.kata.solution.StringyString;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static main.java.com.codewars.kata.solution.StringyString.StringyString.getStringyString;
import static org.junit.Assert.*;

public class StringyStringTest {

    @Test
    public void testingStringyString(){
        Assert.assertEquals("101",getStringyString(3));
    }
    @Test
    public void testingStringyStringOn5(){
        Assert.assertEquals("10101",getStringyString(5));
    }
    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, getStringyString(size).length());
        }
    }
}
