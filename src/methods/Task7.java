package methods;

public class Task7 {
    public static void main(String[] args) {
    }
    public static void check (int[] array){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                sum+=array[i];
                count++;
            }
        }
        System.out.println(sum/count);

    }
}
