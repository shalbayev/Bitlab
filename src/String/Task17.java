package String;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        String result = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            result+=s1.charAt(i);

        }
        if(s2.equals(result)){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}
