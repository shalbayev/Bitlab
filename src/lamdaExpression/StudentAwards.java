package lamdaExpression;

import java.util.ArrayList;

public class StudentAwards {
    Student theMostGPA(ArrayList<Student> students){
        BestStudent mostGPA = (a) -> {
            double max=Double.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).getGpa()>max){
                    max = a.get(i).getGpa();
                    index = i;
                }
            }
            return a.get(index);
        };
        return mostGPA.theBest(students);
    }

    Student theMostAge(ArrayList<Student> students){
        BestStudent mostAge = (a) -> {
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).getAge()>max){
                    max = a.get(i).getAge();
                    index = i;
                }
            }
            return a.get(index);
        };
        return mostAge.theBest(students);
    }

    Student theLongFullName(ArrayList<Student> students){
        BestStudent theLong = (a) ->{
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).getFullName().length()>max){
                    max = a.get(i).getFullName().length();
                    index = i;
                }
            }
            return a.get(index);
        };
        return theLong.theBest(students);
    }

    Student theHighest(ArrayList<Student> students){
        BestStudent highest = (a) -> {
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).getHeight()>max){
                    max = a.get(i).getHeight();
                    index = i;
                }
            }
            return a.get(index);
        };
        return highest.theBest(students);

    }
}
