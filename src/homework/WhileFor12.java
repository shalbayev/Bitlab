package homework;

import java.util.Scanner;

public class WhileFor12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /*int i = 1;
        while(i<=N){
            System.out.println(i + " " + (i*i));
            i++;
        }*/
        for (int i = 1; i <= N ; i++) {
            System.out.println(i + " " + (i*i));
        }
    }
}
