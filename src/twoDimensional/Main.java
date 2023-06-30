package twoDimensional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i]-nums[j]==1){
                    counter++;
                } else if (nums[j]-nums[i]==1) {
                    counter++;
                }
            }
        }
        if(size-counter>counter){
            System.out.println((size/2)-1);
        }
        else if(size-counter<counter){
            System.out.println((counter/2)+1);
        }

    }
}
