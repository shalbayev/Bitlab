package arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int[] arr = {};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();

        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                System.out.println(nums[i]);
            }
        }
    }
}
