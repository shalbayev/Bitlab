package methods;

public class Task10 {
    public static void main(String[] args) {

    }
    public static int check(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%5!=0){
                sum+=array[i];
            }
        }
        return sum;
    }
}
