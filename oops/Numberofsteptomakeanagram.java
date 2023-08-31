package oops;

import java.util.Arrays;
import java.util.Scanner;

public class Numberofsteptomakeanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "leetcode";
        String s2 = "practice";
        int freA[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
          char c= s.charAt(i);
          freA[c-'a'] ++;
        }
        int freB[] = new int[26];
        for(int j=0;j<s2.length();j++)
        {
          char c= s2.charAt(j);
          freB[c-'a'] ++;
        }
        int count =0;
        for(int i=0;i<26;i++)
        {
         count +=Math.abs(freA[i] - freB[i]);
        }
        System.out.println(count/2);
    }

}
