package methods;

public class Task15 {
    public static void main(String[] args) {
        int[] nums = {1 ,0 ,4 ,5 ,0 ,7 ,5 ,7};
        check(nums);

    }
    public static void check(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j >= 0; j--) {
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.print(array[i] + " ");
            }

        }
    }
}
