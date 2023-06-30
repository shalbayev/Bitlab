package twoDimensional;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[][] nums = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[1].length; j++) {
                if(nums[i][j]>max){
                    max = nums[i][j];
                }
                if(nums[i][j]<min){
                    min = nums[i][j];
                }
            }

        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]==min){
                    nums[i][j]=max;
                }
                else if(nums[i][j]==max){
                    nums[i][j]=min;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }



}

