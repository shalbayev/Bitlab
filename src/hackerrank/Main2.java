package hackerrank;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        int degree = in.nextInt();
        int minimal = in.nextInt();
        int salary = in.nextInt();
        int result = 0;
        int count = 0;

        while(true){
            if(price<=minimal){
                price+=degree;
                break;
            }
            price-=3;
        }
        System.out.println(price);
    }
}
