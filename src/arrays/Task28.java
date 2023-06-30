package arrays;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int size = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                size++;
            }
        }
        int[] nums2 = new int[size];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                nums2[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
    }
}

