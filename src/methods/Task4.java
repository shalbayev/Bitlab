package methods;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(palindrome("kazak"));
    }
    public static String palindrome(String str){
        String result = "";
        for (int i = str.length()-1; i >=0; i--) {
            result+=str.charAt(i);
        }
        if(str.equals(result)){
            return "YES";
        }
        else return "NO";
    }
}
