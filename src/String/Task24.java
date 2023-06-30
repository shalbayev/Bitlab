package String;


import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine().trim();
        String result = "";
        boolean check = false;
        for (int i = 0; i < word.length(); i++) {
            int indexSpace = 0;
            int indexUpper = 0;
            if(word.charAt(i)==' '){
                indexSpace = word.indexOf(' ');
                indexUpper = indexSpace+1;
            }

            if(i==0){
                result+= String.valueOf(word.charAt(i)).toUpperCase();


            }

            else if(word.charAt(i)==' '){
                result+=' ';
                result+=String.valueOf(word.charAt(i+1)).toUpperCase();
                i++;
//                System.out.println("as");
            }
            else if (i!=indexUpper && i!=0) {
                result+=word.charAt(i);
//                System.out.println("as");


            }
            indexSpace=0;
            indexUpper=0;


        }
        System.out.println(result);
    }
}