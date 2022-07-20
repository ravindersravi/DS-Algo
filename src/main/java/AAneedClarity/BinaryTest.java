package AAneedClarity;

public class BinaryTest {
    public static void main(String[] args) {
        String b = "1";
       int j = b.length() - 1;
       int carry = 0;
        int sum = carry;
       if(j>=0){
           sum += b.charAt(j--) - '0';
       }
        System.out.println(sum);
        System.out.println("1"+-'0');
        System.out.println();
    }
}
