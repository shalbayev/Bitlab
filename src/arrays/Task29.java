package arrays;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] nums = new int[n];
        boolean check = false;
        int q = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {      //6 19 0 -3 4 8 0 -6 9 5
            if(nums[i]==0){
                check = true;
                q++;
            }
            else if(check==true){
                sum+=nums[i];
                if(nums[i]==0){
                    check = false;
                }
            }
            if(q==2){
                check=false;
            }
        }
        System.out.println(sum);

    }
}
