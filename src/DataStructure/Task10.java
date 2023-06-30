package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }
        int m = in.nextInt();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
            arrayList2.add(in.nextInt());
        }

        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        System.out.println("Sorted first array:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }System.out.println("\nSorted second array:");
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.print(arrayList2.get(i) + " ");
        }

        arrayList.addAll(arrayList2);

        Collections.sort(arrayList);

        System.out.println("\nSorted third array:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

    }
}
