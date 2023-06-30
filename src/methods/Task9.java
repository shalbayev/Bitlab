package methods;

public class Task9 {
    public static void main(String[] args) {
        int[] nums = {45, 67, 12, 23, 47, 98};
        check(nums);
    }
    public static void check(int array[]){
        int i = 0;
        while (array[i]!=23){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
            i++;
        }
//        System.out.println("asd");
    }
}
