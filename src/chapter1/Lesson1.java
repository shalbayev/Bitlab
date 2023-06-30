package chapter1;
import java.util.Scanner;
public class Lesson1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = 351 %100;
        int result2 = result/10;
        int result3 = result%10;
        System.out.println(result3);
        System.out.println(result2);

    }
}
