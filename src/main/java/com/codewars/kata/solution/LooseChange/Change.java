package main.java.com.codewars.kata.solution.LooseChange;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.HashMap;

public class Change {

    public static HashMap<String, Integer> looseChange(int cent) {

        HashMap<String,Integer> change = new HashMap<String, Integer>();
            change.put("Pennies",0);
            change.put("Nickels",0);
            change.put("Dimes",0);
            change.put("Quarters",0);

        if (cent<=0) return change;

        int reminder;
        int quarter;
        int dime;
        int nickels;
        int pennies;

        quarter=cent/25;
        reminder=cent%25;

        dime=reminder/10;
        reminder=reminder%10;

        nickels = reminder/5;
        reminder= reminder%5;

        pennies = reminder;

        change.put("Pennies",pennies);
        change.put("Nickels",nickels);
        change.put("Dimes",dime);
        change.put("Quarters",quarter);
        return change;
    }
}
