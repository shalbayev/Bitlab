package hackerrank;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2!=0){
            System.out.println("Weird");
        }
        else if (num%2==0 && num>=2 && num<=5){
            System.out.println("Not Weird");
        } else if (num%2==0 && num>=6 && num<=20) {
            System.out.println("Weird");
        }
        else System.out.println("Not Weird");
    }
}
