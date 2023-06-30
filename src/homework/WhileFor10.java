package homework;

import java.util.Scanner;

public class WhileFor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        /*for(int i = n; n<=m; n++){
            if (n%3==0){
                System.out.println(n);
            }

        }*/
        while(n<=m){
            if(n%3==0){
                System.out.print(n + " ");
            }
            n++;
        }


    }
}
