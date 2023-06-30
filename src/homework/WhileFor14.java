package homework;

import java.util.Scanner;

public class WhileFor14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int result = 0;
        while(n<=m){
            result = result + n;
            n++;
        }
        System.out.println(result);
    }
}
