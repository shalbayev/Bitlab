import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums =  new int[n];
        int sum = 0;
        float index = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>m){
                sum+=nums[i];
                index++;
            }
        }
        System.out.println(sum/index);

    }
}