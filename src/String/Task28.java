package String;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String result = "";
        for (int i = word.length()-1; i >= 0; i--) {
            result+=word.charAt(i);
        }
        System.out.println(result);
    }
}
