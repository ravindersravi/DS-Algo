public class ParseTest {
    public static void main(String[] args) {
        String cibilScoreStr = "00677";
        try {
            Integer cibilScore =Integer.parseInt(cibilScoreStr);
            System.out.println(cibilScore);
        }
        catch (Exception e){
            System.out.println("fdgfdg");
        }

    }
}
