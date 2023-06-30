package LeetCode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int nums = 5;
        int result = nums;

        System.out.println(isPerfectSquare(nums));
    }
    public static boolean isPerfectSquare(int num){
        boolean check = false;
        for (int i = 0; i < num; i++) {
            if(i*i==num){
                check = true;
            }
        }
        return check;
    }
}
