package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        double sum = 0;

        for (Integer element: nums) {
            sum+=element;
        }
        System.out.println(sum/nums.size());
    }
}
