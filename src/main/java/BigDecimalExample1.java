import java.math.BigDecimal;

public class BigDecimalExample1 {

    public static void main(String[] args) {
        Repayment repayment = new Repayment(new BigDecimal(123),new BigDecimal(123));
        if(repayment.getRepaymentDate()==repayment.getDuedate()){
            System.out.println("equlas method");
        }

    }
}
class Repayment{
    BigDecimal duedate;
    BigDecimal repaymentDate;

    public Repayment(BigDecimal duedate, BigDecimal repaymentDate) {
        this.duedate = duedate;
        this.repaymentDate = repaymentDate;
    }

    public BigDecimal getDuedate() {
        return duedate;
    }

    public void setDuedate(BigDecimal duedate) {
        this.duedate = duedate;
    }

    public BigDecimal getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(BigDecimal repaymentDate) {
        this.repaymentDate = repaymentDate;
    }
}
