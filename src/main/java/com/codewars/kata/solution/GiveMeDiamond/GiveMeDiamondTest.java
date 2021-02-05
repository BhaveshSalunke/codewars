package main.java.com.codewars.kata.solution.GiveMeDiamond;

import org.junit.Test;

import static org.junit.Assert.*;

public class GiveMeDiamondTest {

    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), GiveMeDiamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), GiveMeDiamond.print(5));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        assertEquals(expected.toString(), GiveMeDiamond.print(1));
    }

    @Test
    public void testDiamond0() {
        assertEquals(null, GiveMeDiamond.print(0));
    }

    @Test
    public void testDiamondMinus2() {
        assertEquals(null, GiveMeDiamond.print(-2));
    }

    @Test
    public void testDiamond2() {
        assertEquals(null, GiveMeDiamond.print(2));
    }

    @Test
    public void print() {
    }
}
