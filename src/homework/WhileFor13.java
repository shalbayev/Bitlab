package homework;

import java.util.Scanner;

public class WhileFor13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 0;
        int result = 0;
        while(a>=i){
            result = result + i;
            i++;
        }
        System.out.println(result);
    }
}
