package homework;

import java.util.Scanner;

public class WhileFor19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float result = 0;
        for (float i = 1; i <= a; i++) {
            result+= 1/i;
        }
        System.out.println(result);
    }
}
