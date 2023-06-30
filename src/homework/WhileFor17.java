package homework;

import java.util.Scanner;

public class WhileFor17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 1;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum+=k;
            k+=2;
        }
        System.out.println(sum);
        /*int x = 0;
        int result = 0;
        int i = 0;
        while(true){
            if(x%2!=0){
                result = result + x;
                i++;

            }
            if(i==n){
                System.out.println(result);
                break;
            }
            x++;

        }*/

        }
    }

