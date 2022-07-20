package objectTest;

public class Person {


    String name ;
    int age;

    Person(){
        System.out.println("inside constructor");
    }

    public static void main(String[] args) {
        College person = new College();
        Person person1 = new Person();
        System.out.println(person1.age);//0
        System.out.println(person1.name);//null
        College.display();
        hello();
    }

    static void hello(){
        System.out.println("iam hello");
    }


}
