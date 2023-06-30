package String;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String word2 = word.toLowerCase();
        char letter = in.next().charAt(0);
        int count = 0;
        for (int i = 0; i < word2.length(); i++) {
            if(word2.charAt(i)==letter){
                count++;
            }
        }

        System.out.println(count);
    }
}
