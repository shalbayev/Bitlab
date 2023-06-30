package homework;

import java.util.Scanner;

public class WhileFor29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result+=i*i;
        }
        System.out.println(result);
    }
}
