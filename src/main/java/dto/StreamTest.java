package dto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        List<User> users = userInfo.setData();
        if(users !=null){
            Optional<User> user = Optional.ofNullable(users.stream().filter(a -> a.id > 10).
                    max(Comparator.comparing(User::getAge))).orElse(null);
            if(user!=null && user.isPresent()){
                System.out.println(user);
                System.out.println(user.get());

            }
           // System.out.println(user+"sdffdfd");

            //              .filter(kycFaceMatch -> kycFaceMatch.getUpdatedOn() != null)
            //
            //                    .max(Comparator.comparing(KycFaceMatch::getUpdatedOn))
            //
            //                    .map(KycFaceMatch::getFaceMatchConfidenceScore)
            //
            //                    .orElse(null);

            /*
            Optional<MandatesDetail> mandatesRecord = Optional.ofNullable(mandatesDetailList.stream()
        .filter(mandatesDetail -> MandateRegistrationStatus.Verified.name().equals(mandatesDetail.status))
        .max(Comparator.comparing(MandatesDetail::getAmount))).orElse(null);
             */
        }
    }
}

class UserInfo{


    public List<User> setData(){
        List<User> stundentList = new ArrayList<User>();

        User user = new User(123,"aafssd",77);
        User user1 = new User(124,"aafssd",27);

        User user2 = new User(125,"aafssd",57);

        stundentList.add(user);
        stundentList.add(user1);

        stundentList.add(user2);

        return stundentList;
    }

}


class User{
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int id;
    String name;
    int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}