package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
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
        int count = 0;
        ArrayList<Integer> notUniqueNumbers = new ArrayList<Integer>();
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i)==nums.get(j)){
                    count++;
                }
            }
            if(count>0){
                System.out.print(nums.get(i) + " ");
                count=0;
            }
        }
    }


}

