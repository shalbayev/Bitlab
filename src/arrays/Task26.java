package arrays;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = nums.length-1; i >=0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
