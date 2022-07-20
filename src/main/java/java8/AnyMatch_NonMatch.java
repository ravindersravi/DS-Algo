package java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch_NonMatch {
    public static void main(String[] args) {
        School school = new School();
        List<Person> personList = school.getPersonList();
        boolean ravi = personList.stream().anyMatch(person -> person.getName().equals("ravi"));
        boolean suchitra = personList.stream().noneMatch(person -> person.getName().equals("suchitra"));
        System.out.println(ravi);
        System.out.println(suchitra);
    }
}
@Getter
@Setter
class School{
    List<Person> personList;

    public School() {
        this.personList = new ArrayList<>();
        //personList.add(new Person(123,"ravi"));
        personList.add(new Person(234,"suchitra"));
    }
}
@Getter
@Setter
@AllArgsConstructor
class Person{
    int id;
    String name;

}
