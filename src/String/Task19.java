package String;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int number = 0;
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i))){
                number = Integer.parseInt(String.valueOf(word.charAt(i)));
            }
            if(Character.isAlphabetic((word.charAt(i)))){
                result = String.valueOf(word.charAt(i));
            }
        }
        System.out.println(result + "" + number);
    }
}
