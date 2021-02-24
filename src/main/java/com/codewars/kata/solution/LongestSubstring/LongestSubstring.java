package main.java.com.codewars.kata.solution.LongestSubstring;

import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        //s = abcabc
        int max=0;
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i=0, j=0; i<s.length(); ++i){

            if (map.containsKey(s.charAt(i))){  //i=3 a j=1
                j = Math.max(j,map.get(s.charAt(i))+1); //map.get(a)
            }

            map.put(s.charAt(i),i); //map.put(a,0)    HashMap [a,0][b,1][c,2][a,3]
            max = Math.max(max,i-j+1);  //max=1/2/3/3
        }
        return max;
    }
}
