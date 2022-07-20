package Enum;

import lombok.Getter;
import lombok.Setter;

public class BooleanTest {
    public static void main(String[] args) {
        Person person = new Person();
        // Boolean city = person.getCity();
        if(person.isCity()== false){
            System.out.println("data");
        }
//        if(person.isCity().equals(Boolean.FALSE)){
//            System.out.println("dsdfs");
//        }
    }
}


@Getter
@Setter
class Person{
    int id;
    String name;
    boolean city = false;

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

    public boolean isCity() {
        return city;
    }

    public void setCity(boolean city) {
        this.city = city;
    }
}