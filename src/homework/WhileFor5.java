package homework;

import java.util.Scanner;

public class WhileFor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int a = input.nextInt();
        /*for(int i = 1;i<=a;i++){
            System.out.println(word);
        }*/
        int i = 1;
        while(i<=a){
            System.out.println(word);
            i++;
        }
    }
}
