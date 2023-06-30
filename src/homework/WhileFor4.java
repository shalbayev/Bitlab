package homework;

import java.util.Scanner;

public class WhileFor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
/*        for(int i = 1;i<=a;i++){
            System.out.println(i);
        }*/
        int i = 1;
        while(a>=i){
            System.out.print(i + " ");
            i++;
        }
    }

}
