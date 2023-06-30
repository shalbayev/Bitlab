package twoDimensional;

import java.util.Scanner;
//7 3 4 9 10 //0 0, 0 1, 0 2, 0 3, 0 4
//16 7 8 2 9 //1 0, 1 1, 1 2, 1 3, 1 4
//9 1 4 12 3 //2 0, 2 1, 2 2, 2 3, 2 4
//12 6 7 0 2 //3 0, 3 1, 3 2, 3 3, 3 4
public class Task17 {
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

        for (int i = nums.length-1; i >=0; i--) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


        //0 0  0 1  0 2  0 3  0 4
        //1 0  1 1  1 2  1 3  1 4
        //2 0  2 1  2 2  2 3  2 4
        //3 0  3 1  3 2  3 3  3 4

    }
}
