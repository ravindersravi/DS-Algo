package dto.EualsHashcode;

import java.util.Objects;

class Person{
    int id;
    String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return id == person.id && Objects.equals(name, person.name);
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsTesting {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Ramu");
        Person p2 = new Person(1,"Ramu");
        System.out.println(p1==p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        //if you override equlas & hashcode it will return true
        //else false
        System.out.println(p1.equals(p2));



    }
}
