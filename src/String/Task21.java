package String;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                result+=String.valueOf(word.charAt(i)).toLowerCase();

            }
            else if(Character.isLowerCase(word.charAt(i))){
                result+=String.valueOf(word.charAt(i)).toUpperCase();

            }
            else if(word.charAt(i)==' '){
                result+=" ";

            }
//            else if(Character.isUpperCase(word.charAt(i)) && check==true){
//                result+=" " + String.valueOf(word.charAt(i)).toLowerCase();
//                check=false;
//
//            }
        }

        System.out.println(result);
    }
}
