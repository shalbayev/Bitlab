package String;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine().replace(" ","");
        String result = "";
        boolean check = false;
        for (int i = 0; i < word.length()-1; i++) {
            if(word.charAt(i)=='<'){
                for (int j = i+1; j < word.length(); j++) {
                    if(word.charAt(j)=='>'){
                        result+=" ";
                        break;
                    }
                    else{
                        result+=word.charAt(j);
                    }

                }
            }
        }
        System.out.println(result);
    }
}
