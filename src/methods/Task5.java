package methods;

public class Task5 {
    public static void main(String[] args) {
        contains("macbook", "book");
    }
    public static void contains(String str1, String str2){
        if(str1.contains(str2)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
