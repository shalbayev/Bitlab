package DataStructure;

import java.util.HashSet;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            String n = in.next();
            names.add(n);
        }

        System.out.println(names.size());
    }
}
