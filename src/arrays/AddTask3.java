package arrays;

import java.util.Scanner;

public class AddTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }// 1 2 3 1 5 1 7 8 9
        // 1 1 1 1 1 1

        for (int i = 0; i < nums.length-1; i++) {
            index = 0;

            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] != nums[j]){
                    index++;
                }
                if(index == nums.length-1){
                    System.out.println(nums[i]);
                }
            }
        }

    }
}
