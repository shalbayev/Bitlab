package arrays;

import java.util.Scanner;
//4 -2 7 -5 13 -16
public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int minus = 0;
        int plus = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        if(n%2==0){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]<0){
                    minus++;
                }
                else plus++;

            }
            if(plus==minus){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        else if(n%2!=0){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]<0){
                    minus++;
                }
                else plus++;

            }
            if(plus==minus+1 || plus+1==minus){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
