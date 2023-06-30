package DataStructure;

import java.util.HashSet;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> nums = new HashSet<>();
        int numbers;
        int sum = 0;
        do{
            numbers = in.nextInt();
            nums.add(numbers);
        }
        while (numbers!=0);

        for (int el:
             nums) {
            sum+=el;
        }

        System.out.println(sum);
    }
}
