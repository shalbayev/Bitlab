package DataStructure;

import java.util.Scanner;
import java.util.TreeSet;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<String> names = new TreeSet<>();
        TreeSet<String> names2 = new TreeSet<>();

        String n;
        int count=0;
        boolean check = false;
        while(count>=2){
            n = in.next();
            if (check) {
                names2.add(n);
            }
            else if(n.equals("exit")){
                check=true;
                count++;
            }
            names.add(n);



        }

        System.out.println(names);
    }
}
