package Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String name = in.next();
            int number = in.nextInt();
            list.put(name, number);
        }

        System.out.println(list.size());
    }
}
