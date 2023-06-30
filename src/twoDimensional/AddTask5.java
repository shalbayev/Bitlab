package twoDimensional;

import java.util.Random;

public class AddTask5 {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        Random random = new Random();
        double sum = 0;
        int n = nums.length*nums[0].length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(10);

            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];
            }
        }
        double arithmeticMean = sum/n;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Arithmetic mean:" + arithmeticMean);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]>arithmeticMean){
                    nums[i][j] = 1;
                } else if (nums[i][j]<arithmeticMean) {
                    nums[i][j] = 0;

                }
            }
        }
        System.out.println("-------------------");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
