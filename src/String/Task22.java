package String;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i))){
                result+=0;
            }
            else result+=word.charAt(i);

        }
        System.out.println(result);
    }
}
