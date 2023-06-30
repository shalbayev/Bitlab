package streamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class PersonFilter {
    List<Person> filterPersons(List<Person> persons){
        return persons.stream().filter(s->s.getCity().equals("Almaty") && s.getAge()>=18).collect(Collectors.toList());
    }
}
