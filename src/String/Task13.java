package String;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        //hello
        for (int i = word.length()-1; i>=0; i--) {
            System.out.print(word.charAt(i) + "");
        }
    }
}
