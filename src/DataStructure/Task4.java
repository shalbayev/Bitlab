package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        int count = 0;
        for (int element:
             nums) {
            if(element>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
