package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int input = 0;
        do{
            input = in.nextInt();
            nums.add(input);
        }
        while(input!=0);

        int max = Integer.MIN_VALUE;
        nums.remove(nums.size()-1);
        for (int element:
             nums) {
            if(element<0){
                System.out.print(element + " ");
                if(element>max){
                    max = element;
                }
            }
        }
        System.out.println();
        System.out.println(max);
    }
}
