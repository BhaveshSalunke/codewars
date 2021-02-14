package main.java.com.codewars.kata.solution.FindOddInt;

import java.util.HashMap;
import java.util.Map;

public class FindOddInt {

    public static int findIt(int[] a) {

        Map<Integer,Integer> hash = new HashMap<>();

        for (int input: a){
            boolean visited = hash.containsKey(input);
            if(!visited) {
                hash.put(input,1);
            }
            else{
                hash.put(input,hash.get(input)+1);
            }
        }
        for (Map.Entry<Integer, Integer> hashSet : hash.entrySet()){
            if (hashSet.getValue()%2==1) return hashSet.getKey();
        }
        return 0;
    }
}

