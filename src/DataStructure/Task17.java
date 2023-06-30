package DataStructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> nums = new TreeSet<>();
//        HashSet<String> letters = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
        int input;
        int sum=0;
        do{
            input = in.nextInt();
            nums.add(input);
        } while(input!=0);
        nums.remove(0);

        System.out.println(nums);
    }
}
