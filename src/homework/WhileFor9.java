package homework;

import java.util.Scanner;

public class WhileFor9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i = a;i<=b;i = i+2){
            if(i%2==0){
                i = i + 1;
            }
            System.out.print(i + " ");
        }
        /*if (a % 2 == 0) {
            a++;
            for(int i = a;i<=b;i = i+2){
            System.out.print(i + " ");
            }
        }
        else for(int i = a;i<=b;i = i+2){
            System.out.print(i + " ");
        }*/
    }
}
