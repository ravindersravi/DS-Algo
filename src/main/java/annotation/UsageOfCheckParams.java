package annotation;

public class UsageOfCheckParams {
    @CheckParams(value = "max_credit_validity", fallback = "730")
    protected static Integer maxCreditValidity;
    public static void main(String[] args) {

          Integer i = maxCreditValidity;
        System.out.println(i);
    }
}