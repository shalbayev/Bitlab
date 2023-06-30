package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        'door' occurs 2 times
//        'cat' occurs 3 times
//        'dog' occurs 2 times
//        'house' occurs 1 times
        HashMap<String, Integer> animals = new HashMap();
//        animals.put("door",2);
//        animals.put("cat",3);
//        animals.put("dog",2);
//        animals.put("house",1);
        String n = in.nextLine();
        String[] aniArr = n.split(" ");
        String someWord = aniArr[0];
        int count = 1;

        //dog 2 cat 3 door 2
//        for (int i = 0; i < aniArr.length; i++) {
//            if(animals.containsKey(aniArr[i])){
//                animals.put(aniArr[i],count+1);
//                System.out.println("not first time " + aniArr[i]);
//            }
//            else {
//                animals.put(aniArr[i],count);
//                System.out.println(aniArr[i]);
//
//
//            }
//        }

        for (int i = 0; i < aniArr.length; i++) {
            animals.put(aniArr[i],count);
            for (int j = i+1; j < aniArr.length; j++) {
                if(aniArr[i].equals(aniArr[j])){
                    count++;
                }
            }


        }


        System.out.println(animals);
    }
}
