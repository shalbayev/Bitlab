package twoDimensional;

import java.util.Scanner;

public class Task13 {
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
            for (int j = 0; j < nums[1].length; j++) {
                if(nums[i][j]%2!=0){
                    nums[i][j]=0;
                }
            }

        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[1].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }
    }



}

