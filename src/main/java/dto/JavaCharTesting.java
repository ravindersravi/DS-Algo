package dto;

public class JavaCharTesting {
    public static void main(String[] args) {
        String s1 = "tutorialspoint";
        String s2 = "tutorialspoints";
        if(s1.length()!=s2.length()) {

            processingOfChar(s1, s2);
        }
    }

    private static void processingOfChar(String s1, String s2) {
        String s3 = new String ("Tutorials Point");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}
