package DataStructure;

import java.util.HashSet;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> nums = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            nums.add(in.nextInt());
        }

        for (int element:
             nums) {
            sum+=element;
        }

        System.out.println(sum);
    }
}
