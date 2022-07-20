public class TestV2 {
    public static void main(String[] args) {
        Integer i = 123;
        Integer j = 234;
        Integer k = 456;
        User user1= new User(123,true);
     //   User user2= new User(123,"ravi");

        if(Boolean.TRUE.equals(user1.getName())){
            System.out.println("ravisnfdf");
        }

        if(i>100){
            System.out.println("inside i");
        }
        else if(j>100){
            System.out.println("inside j");
        }
        else {
            System.out.println("k methos");
        }

    }
}
class User{
    int id;
    Boolean name;

    public User(int id, Boolean name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getName() {
        return name;
    }

    public void setName(Boolean name) {
        this.name = name;
    }
}
