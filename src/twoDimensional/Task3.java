package twoDimensional;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] nums = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        int x = in.nextInt();
        for (int i = 0; i < nums[x].length; i++) {
            System.out.print(nums[x][i] + " ");
        }
//        int[][] nums = {
//                {121,321,42,42,65},
//                {12,54},
//                {87,54}
//        };
//        System.out.println(nums[1]);
    }
}
