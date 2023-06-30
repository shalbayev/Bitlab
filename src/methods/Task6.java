package methods;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(check("admin","qwerty"));
    }
    public static String check(String str1, String str2){
        if(str1.equals("admin") && str2.equals("qwerty")){
            return "Authentication completed";
        }
        else return "Invalid login or password";
    }
}
