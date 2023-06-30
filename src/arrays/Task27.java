package arrays;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int ex = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }                             //10 6 8 7 9 2 3
        }                                 //2  6 8 7 9 2 3
        for (int i = 0; i < nums.length; i++) {
            if(max==nums[i]){
                nums[i] = min;
            }
            else if(min==nums[i]){
                nums[i] = max;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}