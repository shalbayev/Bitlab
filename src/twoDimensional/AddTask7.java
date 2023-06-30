package twoDimensional;

import java.util.Scanner;

public class AddTask7 {
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
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("--------------------------------");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[j][i]%3==0){
                    sum+=nums[j][i];
                }
            }
            System.out.print(sum+ " ");
            sum=0;
        }
    }
}
