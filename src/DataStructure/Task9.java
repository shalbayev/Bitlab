package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int input;
        do{
            input = in.nextInt();
            nums.add(input);
        }
        while(input!=0);
        nums.remove(nums.size()-1);

        for (int i = 0; i < nums.size(); i++) {
            int count=0;

            if(nums.get(i)!=1){
                for (int j = 1; j <= nums.get(i); j++) {
                    if(nums.get(i)%j==0){
                        count++;
                    }
                }
            }

            if(count==2){
                System.out.print(nums.get(i) + " ");
            }
        }
    }
}
