package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int number = in.nextInt();
        if(number==1){
            for (int i = nums.length-1; i >=0 ; i--) {
                System.out.print(nums[i] + " ");
            }
        } else if (number==2) {
            for (int i = 0; i < nums.length; i++) {
                sum+=nums[i];
            }
            System.out.println(sum);

        } else if (number==3) {
            System.out.println(sum/nums.length);
        } else if (number==4) {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]<min){
                    min = nums[i];
                }
            }
            System.out.println(min);

        } else if(number==5){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]>max){
                    max = nums[i];
                }
            }
            System.out.println(max);

        } else if (number==6) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        } else if (number==7) {
            Arrays.sort(nums);
            for (int i = nums.length-1; i>=0; i--) {
                System.out.println(nums[i]);
            }
            
        }


    }
}
