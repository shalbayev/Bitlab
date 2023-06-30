package homework;

import java.util.Scanner;

public class WhileFor18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 0;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            k+=3;
            sum+=k;

        }
        System.out.println(sum);

    }
}

