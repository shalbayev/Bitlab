package LeetCode;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";
        countPrefixes(words, s);
    }

    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            w+=s.charAt(i);
            for (int j = 0; j < words.length; j++) {
                if(w.equals(words[j])){
                    count++;
                }
            }
        }
        return count;

    }



}
