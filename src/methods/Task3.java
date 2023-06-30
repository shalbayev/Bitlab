package methods;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(check(in.nextLine(), in.next().charAt(0)));
    }
    public static int check(String str, char letter){
        String word = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==letter){
                count++;
            }
        }
        return count;
    }
}
