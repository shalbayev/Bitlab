package methods;

public class Task12 {
    public static void main(String[] args) {
        check("Bitlab");
    }
    public static void check(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result+=str.charAt(i);
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
