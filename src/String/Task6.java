package String;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String word2 = in.next();
        if(word.contains(word2)){
            System.out.println(word.indexOf(word2));
        }

        else System.out.println("THERE IS NO SUCH LETTER");
    }
}
