package LeetCode;

import java.util.ArrayList;

public class BasebollGame {
    public static void main(String[] args) {

        /*Explanation:
        "5" - Add 5 to the record, record is now [5].
        "2" - Add 2 to the record, record is now [5, 2].
        "C" - Invalidate and remove the previous score, record is now [5].
        "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
        "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
        The total sum is 5 + 10 + 15 = 30.*/

        /*Input: ops = ["5","-2","4","C","D","9","+","+"]
        Output: 27
        Explanation:
        "5" - Add 5 to the record, record is now [5].
        "-2" - Add -2 to the record, record is now [5, -2].
        "4" - Add 4 to the record, record is now [5, -2, 4].
        "C" - Invalidate and remove the previous score, record is now [5, -2].
        "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
        "9" - Add 9 to the record, record is now [5, -2, -4, 9].
        "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
        "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
        The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.*/

        /*An integer x.
                Record a new score of x.
        '+'.
                Record a new score that is the sum of the previous two scores.
        'D'.
                Record a new score that is the double of the previous score.
        'C'.
                Invalidate the previous score, removing it from the record.
        Return the sum of all the scores on the record after applying all the operations.*/
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] s = {"5", "2", "C", "D", "+"};
        int sum = 0;
        int temp = 0;
        boolean check = false;
        //Character.isDigit(name.charAt(2))
        for (int i = 0; i < s.length; i++) {
            if (Character.isDigit(s[i].charAt(0))) {
                numbers.add(Integer.parseInt(s[i]));
            } else if (s[i].equals("+")) {
                if (numbers.size() == 0) {
                    sum++;
                } else if (numbers.size() == 1) {
                    sum++;
                } else if (numbers.size() > 1) {
                    temp = numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2);
                    numbers.add(temp);
                }
            } else if (s[i].equals("D")) {
                if (numbers.size() == 0) {
                    sum++;
                } else if (numbers.size() >= 1) {
                    temp = numbers.get(numbers.size() - 1) * 2;
                    System.out.println(temp);
                    numbers.add(temp);
                }
                System.out.println(numbers);


            } else if (s[i].equals("C")) {
                if(numbers.size()==0){
                    sum++;
                }
                else numbers.remove(numbers.size()-1);
            }
        }
        int summa = 0;
        for (int i = 0; i < numbers.size(); i++) {
            summa+=numbers.get(i);
        }
        System.out.println(summa);
    }
}

