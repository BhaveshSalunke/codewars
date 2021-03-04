package main.java.com.codewars.kata.solution.StringyString;

public class StringyString {

    public static String getStringyString(int size) {

        String output = "";
        boolean flag = true;

        for (int i = 0; i < size; i++) {

            if (flag) output = output.concat("1");
            if (!flag) output = output.concat("0");
            flag = !flag;
        }
        return output;
    }
}
