package String;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+ "" + word.charAt(i));
        }
    }
}
