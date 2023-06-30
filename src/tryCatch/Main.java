package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            int x = in.nextInt();
            System.out.println(n/x);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero");
        }*/
        /*Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] nums = new int[s];
        for (int i = 0; i < s; i++) {
            try {
                nums[i] = in.nextInt();

            }
            catch (InputMismatchException f){
                nums[i]=0;
                in.next();

            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]*nums[i] + " ");
        }
*/

        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            try {
                nums[i] = in.nextInt();

            }
            catch (InputMismatchException e){
                in.next();
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }

        System.out.println(sum);*/
//        int i = 0;
//        while(i<5){
//            System.out.println("hi");
//            i++;
//        }
        Scanner in = new Scanner(System.in);
        int sum = 0;
        boolean check = true;
        while (check){
            try{
                int n = in.nextInt();
                int n2 = in.nextInt();
                sum = n + n2;
                System.out.println("Sum of numbers: " + sum);
                check = false;

            }
            catch(InputMismatchException e){
                System.out.println("Error: Author data entered. Try again.");
                in.next();
            }
        }


    }
}
