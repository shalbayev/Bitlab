package homework;

import java.util.Scanner;

public class WhileFor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        /*while(a<=b){
            System.out.print(a + " ");
            a++;
        }
*/      for(int i = a; i<=b; i++){
            System.out.print(i + " ");
        }
    }
}
