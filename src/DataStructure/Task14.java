package DataStructure;

import java.util.HashSet;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> nums = new HashSet<>();
        int input;
        boolean check = false;
        do{
            input = in.nextInt();
            nums.add(input);
        } while(input!=0);


        for (int el:
             nums) {
            if(el==77){
                System.out.println("YES");
                check = true;
            }
            else check=false;
        }
        if(check==false){
            System.out.println("NO");
        }
    }
}
