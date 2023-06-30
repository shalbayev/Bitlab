package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt()/2);
        }
//        System.out.println(nums);

        for (int element: nums) {
            System.out.print(element + " ");
        }

    }
}
