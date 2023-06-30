package homework;

import java.util.Scanner;

public class WhileFor28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();       //за первый банан
        int n = input.nextInt();       //его количество денег
        int w = input.nextInt();
        int sum = 0;
        for (int i = 1; i <=w; i++) {
            sum+=(k*i);

        }
        if(sum-n==0){
            System.out.println(0);
        }
        System.out.println(sum-n);
    }
}
