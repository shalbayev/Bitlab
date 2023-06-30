package methods;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(check("apple"));
    }
    public static int check(String s1){
            String s2 = s1.toLowerCase();
            char[] letters = {'a', 'e', 'i', 'o', 'u'};
            int count = 0 ;
            for (int i = 0; i < s2.length(); i++) {
                for (int j = 0; j < letters.length; j++) {
                    if(s2.charAt(i)==letters[j]){
                        count++;
                    }
                }
            }
            return count;
    }
}
