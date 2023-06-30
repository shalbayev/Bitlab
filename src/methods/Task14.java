package methods;

public class Task14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        check(arr);
    }
    public static int check(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                count++;
            }
        }
        return count;
    }
}
