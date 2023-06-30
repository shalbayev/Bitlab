package arrays;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        double sum = 0;
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                sum+=nums[i];
                size++;
            }
        }
        System.out.println(sum/size);
    }
}
