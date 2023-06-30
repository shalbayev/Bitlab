package twoDimensional;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int [][] nums = {{12,5,7,6},{4,0,2,7},{9,1,3,2},{10,-2,4,6}};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(nums[n][m]);

    }
}
