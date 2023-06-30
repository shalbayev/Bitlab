package LeetCode;
import java.lang.*;

public class task2 {
    public static void main(String[] args) {
        String number = "551";
        char digit = '5';


    }
    public static String removeDigit(String number, char digit) {
        int max = 0;
        String result = "";
        String lResult = "";

        for (int i = 0; i < number.length(); i++) {
            StringBuffer sbf = new StringBuffer(number);
            if(number.charAt(i)==digit){
                result=(sbf.deleteCharAt(i)).toString();
//                System.out.println(result);
                if(max<Integer.parseInt(result)){
                    max = Integer.parseInt(result);
                }
            }

        }
        lResult = String.valueOf(max);
        return lResult;
    }

}
