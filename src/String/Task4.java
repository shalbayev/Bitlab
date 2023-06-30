package String;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = "java";
        String n = in.next();
        if(word.equalsIgnoreCase(n)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
