package AAjenny;

public class ASCIICHAR {
    public static void main(String[] args) {
        // 48 -->0, 57  65-A,90-Z  97-a ,122-Z

        char c;
        for(c='A';c<='Z';c++)
        {
            System.out.print(c + " ");
        }
        System.out.println("----------");
        char c1 = 'A';
        int A = 97;

        System.out.println((int) c1);
        System.out.println((char) A);
    }
}
