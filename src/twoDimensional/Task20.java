package twoDimensional;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }

        //0 0  0 1  0 2
        //1 0  1 1  1 2
        //2 0  2 0  2 2

//        for (int i = nums.length-1; i >=0; i--) {
//            System.out.print(nums[i] + " ");
//        }
        for (int i = nums.length-1; i >=nums.length-1; i--) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 1; i < nums.length-1; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
