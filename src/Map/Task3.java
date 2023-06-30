package Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> footballers = new HashMap<>();
        while (footballers.size()!=5){
            String name = in.next();
            int number = in.nextInt();
            footballers.put(name,number);
        }
        for (String n:
             footballers.keySet()) {
            System.out.println(n + " scored " + footballers.get(n) + " goals in EPL");
        }
    }
}
