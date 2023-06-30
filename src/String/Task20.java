package String;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine().trim();
        String word2 = word.replace(" ","");
        int result = 0;
        String number = "";
        String number2 = "";
        boolean check = false;

        if (word2.contains("+")) {
            int plusIndex = word2.indexOf("+");
            int lastElement = word2.length();
            if ((word2.charAt(plusIndex)) == '+') {
                number += word2.substring(0, plusIndex);
                number2 += word2.substring(plusIndex + 1, lastElement);
                System.out.println(Integer.parseInt(number) + Integer.parseInt(number2));
            }
        }else if (word2.contains("-")) {
                int plusIndex = word2.indexOf("-");
                int lastElement = word2.length();
                if ((word2.charAt(plusIndex)) == '-') {
                    number += word2.substring(0, plusIndex);
                    number2 += word2.substring(plusIndex + 1, lastElement);
                    System.out.println(Integer.parseInt(number) - Integer.parseInt(number2));
                }

        } else if (word2.contains("*")) {
            int plusIndex = word2.indexOf("*");
            int lastElement = word2.length();
            if((word2.charAt(plusIndex))=='*'){
                    number+=word2.substring(0,plusIndex);
                    number2 += word2.substring(plusIndex+1,lastElement);
                    System.out.println(Integer.parseInt(number)*Integer.parseInt(number2));
            }
        }
        else if (word2.contains("/")) {
            int plusIndex = word2.indexOf("/");
            int lastElement = word2.length();
            if((word2.charAt(plusIndex))=='/'){
                number+=word2.substring(0,plusIndex);
                number2 += word2.substring(plusIndex+1,lastElement);
                System.out.println(Integer.parseInt(number)/Integer.parseInt(number2));
            }
        }
    }
}
