package arrays;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%3==0){
                System.out.println(nums[i]);
            }
        }
    }
}
