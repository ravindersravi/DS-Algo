import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        Persons p1 = new Persons();
        p1.setOldAge(BigDecimal.valueOf(Long.parseLong("23.34534")));
        p1.setNewAge(BigDecimal.valueOf(Long.parseLong("23.34534")));

        if(p1.getOldAge().compareTo(p1.getNewAge())!=0){
            System.out.println("12313");
        }
        if(p1.getOldAge() != p1.getNewAge()){
            System.out.println("I am inside of if loop");
        }
        if(p1.getOldAge() == p1.getNewAge()){
            System.out.println("I am inside of if loop equals ");
        }
        if((p1.getOldAge().compareTo(p1.getNewAge()) )!=0){
            {
                System.out.println("Indide of compare to Method");
            }
        }

    }
}
class Persons{
    BigDecimal oldAge;
    BigDecimal newAge;

    public BigDecimal getOldAge() {
        return oldAge;
    }

    public void setOldAge(BigDecimal oldAge) {
        this.oldAge = oldAge;
    }

    public BigDecimal getNewAge() {
        return newAge;
    }

    public void setNewAge(BigDecimal newAge) {
        this.newAge = newAge;
    }
}