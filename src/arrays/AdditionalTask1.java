package arrays;

import java.util.Scanner;
//2 7 4 1 6
//8
public class AdditionalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int a = in.nextInt();
        int[] nums = new int[a];
        int counter = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();

        }
        System.out.println("Введите число для нахождения пар:");
        int b = in.nextInt();

//уникальные цифры вывести, не повторяющийся
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j]==b){
                    System.out.println(nums[i] + " + " + nums[j]);
                }
            }

        }
    }
}
