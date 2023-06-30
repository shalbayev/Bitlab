package arrays;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int s = 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0 && i%2==0){
                s*=nums[i];
            }
        }
        System.out.println(s);
    }
}
