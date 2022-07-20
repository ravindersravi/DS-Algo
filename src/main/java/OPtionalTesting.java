import java.util.Optional;

public class OPtionalTesting {
    public static void main(String[] args) {
        Data data = new Data(null);
        String dob =  Optional.ofNullable(data.getPersonalDetails())
                .map(PersonalDetails::getName).orElse(null);
        System.out.println(dob);
    }
}

class Data{
    PersonalDetails personalDetails;

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public Data(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
}
class PersonalDetails{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonalDetails(int age, String name) {
        this.age = age;
        this.name = name;
    }
}