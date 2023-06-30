package lamdaExpression;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*SumOperation sum = new SumOperation();
        System.out.println(sum.getSum(4,5));

        MultiplyOperation mult = new MultiplyOperation();
        System.out.println(mult.getMultiplication(4,5));

        Student st = new Student("Temirlan Shalbayev", 22,2.1,190);
        Student st2 = new Student("Tasdasdas", 45,4.1,496);
        Student st3 = new Student("asdasdasdas", 12,8.1,32);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st);
        students.add(st2);
        students.add(st3);
        System.out.println(students);

        StudentAwards studentAwards = new StudentAwards();
        BestStudent bestStudent = studentAwards ::theMostGPA;
        BestStudent bestStudent1 = studentAwards ::theMostAge;
        BestStudent bestStudent2= studentAwards ::theHighest;
        BestStudent bestStudent3= studentAwards ::theLongFullName;

        System.out.println("The best student who has a high GPA -> " + bestStudent.theBest(students).fullName);
        System.out.println("The best student who has a high AGE -> " + bestStudent1.theBest(students).fullName);
        System.out.println("The best student who has a high HIGHEST -> " + bestStudent2.theBest(students).fullName);

*/
//        Scanner in = new Scanner(System.in);
//        String stoke;
//        ArrayList<String> sozder = new ArrayList<>();
//        do{
//            stoke = in.next();
//            sozder.add(stoke);
//
//        } while(!stoke.equals("exit"));
//
//        sozder.remove(sozder.size()-1);
//
//        int min=0;
//        for (int i = 0; i < sozder.size(); i++) {
//
//        }
        Scanner in = new Scanner(System.in);
        ArrayList<String> hs = new ArrayList<>();
        String n = "";
        while (!n.equals("exit")) {
            n = in.next();
            hs.add(n);

        }
        int index = 0;
        int min = Integer.MAX_VALUE;
        hs.remove(hs.size()-1);

        for (int i = 0; i < hs.size(); i++) {
            if(hs.get(i).length()<min){
                Collections.swap(hs, i,index);
                min = hs.get(i).length();
                index = i;
            }
        }

        System.out.println(hs);





    }
}
