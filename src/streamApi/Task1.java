package streamApi;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }

        nums.stream().filter(s ->s%2==0).forEach(s-> System.out.print(s + " "));
    }
}
