package methods;

public class Task2 {
    public static void main(String[] args) {

    }
    public static String triangle(int a, int b, int c){
        if(a+b>c){
            return "YES";
        }
        if(b+c>a){
            return "YES";
        }
        else return "NO";
    }
}
