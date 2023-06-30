package twoDimensional;

import java.util.Random;

public class AddTask4 {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int indexI = 0;
        int indexJ = 0;
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
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]>max){
                    max = nums[i][j];
                    indexI = i;
                    indexJ = j;
                }else if (nums[i][j]!=max){
                    sum+=nums[i][j];
                }
                if (nums[i][0]!=max) {
                    sum+=nums[i][0];

                }
            }
            nums[indexI][indexJ] = sum;
            max = 0;
            indexI = 0;
            indexJ = 0;
            sum = 0;
        }


        System.out.println("---------------------------------");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
