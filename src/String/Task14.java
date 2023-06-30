package String;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  word = in.next();
        String word2 = in.next();
        if(word.contains(word2)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
