package twoDimensional;

import java.util.Scanner;

public class Task10 {
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

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
                for (int j = 0; j < nums[1].length; j++) {
                    if(j%2==0){
                        sum += nums[i][j];
                    }
                }
            }
        }
        System.out.println(sum);



    }
}
