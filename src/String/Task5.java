package String;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String word2 = in.next();
        if(word.equalsIgnoreCase(word2)){
            System.out.println("THEY ARE EQUAL");
        }
        else System.out.println("THEY ARE NOT EQUAL");
    }
}
