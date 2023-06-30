package twoDimensional;

import java.util.Scanner;

public class Task19 {
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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j][i]>max){
                    max=nums[j][i];
                }

            }
            System.out.println(max);
            max=0;

        }
//        System.out.println(nums[0].length);
        //0 0  0 1  0 2  0 3  0 4
        //1 0  1 1  1 2  1 3  1 4
        //2 0  2 1  2 2  2 3  2 4
        //3 0  3 1  3 2  3 3  3 4
    }
}
