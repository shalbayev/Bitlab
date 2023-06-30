package String;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next().toLowerCase();
        char[] letters = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if(word.charAt(i)==letters[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
