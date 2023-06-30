package lamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Database {
    List<Person> personList = new ArrayList<>();


    void addPerson(Person person) {
        personList.add(person);
    }

    void printYoungPeopleNames() {
        ArrayList<String> youngPerson = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getAge() >= 18 && personList.get(i).getAge() <= 30) {
                youngPerson.add(personList.get(i).getName());
            }
        }
        Collections.sort(youngPerson);

        for (String n:
             youngPerson) {
            System.out.print(n + " ");
        }
    }
}
