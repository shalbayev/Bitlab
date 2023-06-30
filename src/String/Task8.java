package String;


import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        if(word.equals("one")){
            System.out.println(1);
        } else if (word.equals("two")) {
            System.out.println(2);
        }else if (word.equals("three")) {
            System.out.println(3);
        }else if (word.equals("four")) {
            System.out.println(4);
        }else if (word.equals("five")) {
            System.out.println(5);
        }else if (word.equals("six")) {
            System.out.println(6);
        }else if (word.equals("seven")) {
            System.out.println(7);
        }else if (word.equals("eight")) {
            System.out.println(8);
        }else if (word.equals("nine")) {
            System.out.println(9);
        }else if (word.equals("0")) {
            System.out.println("zero");
        }
    }
}
