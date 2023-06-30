package hackerrank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] nums = new int[size];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
//6
//7 1 3 4 1 7
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count = j-i;
//                    System.out.println(i +" " + j);
                }
                if(count<min && count!=0){
                    min=count;
//                        System.out.println(i +" " + j);
                }



            }

        }
        if(min==Integer.MAX_VALUE){
            min=-1;
        }
        System.out.println(min);
        
    }
}
