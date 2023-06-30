package DataStructure;

import java.util.HashSet;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> nums = new HashSet<>();
        String names;
        int sum=0;
        do{
            names = in.next();
            nums.add(names);
        } while(!names.equals("stop"));
        nums.remove("stop");

        for (String el:
             nums) {
            sum+=el.length();
        }


        System.out.println(sum);
    }
}
