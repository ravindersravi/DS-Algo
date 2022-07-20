package objectTest;

public class TryBlockTest {
    public static void main(String[] args) {
        int m=10;
        if (m > 0) {
            try {
                int n = 10 / 0;
            } catch (Exception e) {
                System.out.println("exception---");
            }
            System.out.println("excsdfsdf");
        }
    }

}
