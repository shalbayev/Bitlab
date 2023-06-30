package String;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(Character.isAlphabetic(word.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
