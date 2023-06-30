package DataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
//        HashSet<String> letters = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
        char[] letterArrs={'a', 'e', 'i', 'o', 'u'};
        String name;
        int sum=0;
        do{
            name = in.next().toLowerCase();
            names.add(name);
        } while(!name.equals("stop"));
        names.remove("stop");

        for (String element:
                names) {
            for (int j = 0; j < element.length(); j++) {
                for (int i = 0; i < letterArrs.length; i++) {
                    if(element.charAt(j)==letterArrs[i]){
                        sum++;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
