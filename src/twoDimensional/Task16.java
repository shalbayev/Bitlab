package twoDimensional;

import java.util.Scanner;
//2 3
//0 0, 0 1, 0 2
//1 0, 1 1, 1 2
//6 2 7
//4 11 9
/*for (int i = nums.length-1; i >=0; i--) {
        System.out.print(nums[i] + " ");
        }*/
public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[1].length-1; j>=0; j--) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
