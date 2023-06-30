package String;

import java.util.Scanner;


public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String result = "";
        for (int i = word.length()-1; i>=0; i--) {
            result+=word.charAt(i);
        }
        if(result.equals(word)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
