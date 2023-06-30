package homework;

import java.util.Scanner;

public class WhileFor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int result = 1;
        for(int i = 1;i<=a;i++){
            result*=i;
        }
        System.out.println(result);
    }
}
