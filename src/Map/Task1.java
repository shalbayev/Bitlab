package Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String name = in.next();
            int price = in.nextInt();
            list.put(name,price);
        }

        for (String key:
             list.keySet()) {
            System.out.println(key + " costs " + list.get(key) + " USD");
        }

    }
}
