package twoDimensional;

import java.util.Random;
import java.util.Scanner;

public class AddTask {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(10);

            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(nums[0][1] + nums[1][1] + nums[2][2] + nums[3][3]);
    }
}
