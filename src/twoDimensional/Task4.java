package twoDimensional;
//4 5
//
//2 -4 -5 6 7
//0 1 -2 9 11
//-1 -1 8 3 0
//3 4 5 6 7
import java.util.Scanner;

public class Task4 {
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
        //nums[0]
        //nums[2]
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();

            }

        }
    }
}
