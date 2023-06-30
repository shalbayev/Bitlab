package hackerrank;

import java.util.Scanner;
// 0 0 1 0 0 1 1 0 0 1
public class Clouds {
    //8 2
    //0 0 1 0 0 1 1 0
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int e = 100;
        boolean check = false;
        int [] c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = in.nextInt();
        }
        if(n%k==0){
            int [] arr = new int[n/k];
        }
        else if(n%k!=0){
            int[] arr2 = new int[n];
        }

    }
}
