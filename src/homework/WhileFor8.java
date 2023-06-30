package homework;

import java.util.Scanner;

public class WhileFor8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 1;i<10;i++){
            System.out.println(i + " " + a*i);

        }
    }
}
