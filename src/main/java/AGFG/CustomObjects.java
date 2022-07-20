package AGFG;

import dto.Cleancode.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomObjects {
    public static void main(String[] args) {
        List<Users> users = Arrays.asList(new Users("George", 15),
                new Users("Tom", 10),
                new Users("Mike", 12));

        // get a user with the minimum age
        Users user1 = users.stream()
                .min(Comparator.comparingInt(Users::getAge))
                .get();

        System.out.println("User with minimum age: " + user1);

        // get a user with the maximum age
        Users user2 = users.stream()
                .max(Comparator.comparingInt(Users::getAge))
                .get();

        System.out.println("User with maximum age: " + user2);
    }

}

class Users
{
    private String name;
    private Integer age;

    public Users(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    // other getters and setters

    @Override
    public String toString() {
        return "[" + name + ", " + String.valueOf(age) + "]";
    }
}



