package String;

import java.util.Scanner;
//replace
public class Task26 {
    //One + two = three
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine().toLowerCase().trim();
        word = word.replace("zero", "0");
        word = word.replace("one", "1");
        word = word.replace("two", "2");
        word = word.replace("three", "3");
        word = word.replace("four", "4");
        word = word.replace("five", "5");
        word = word.replace("six", "6");
        word = word.replace("seven", "7");
        word = word.replace("eight", "8");
        word = word.replace("nine", "9");
        System.out.println(word);
    }
}
