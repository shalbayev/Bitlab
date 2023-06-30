package String;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i))){
                sum+= Integer.parseInt(String.valueOf(word.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
