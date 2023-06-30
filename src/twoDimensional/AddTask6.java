package twoDimensional;

import java.awt.*;
import java.util.Scanner;

public class AddTask6 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int [][] nums = new int[n][m];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                nums[i][j] = in.nextInt();
//            }
//        }
        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//
//            }
//            System.out.println();
//        }
        int b = 10;
        double a = Math.pow((double)b,0.5);
        for (int i = 2; i < a; i++) {
            if(b%i==0){
                System.out.println("Not simple");
            } else System.out.println("Simple");
        }

    }
}
