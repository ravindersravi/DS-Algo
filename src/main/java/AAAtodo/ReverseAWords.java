package AAAtodo;

public class ReverseAWords {
    public static void main(String[] args) {
        String s = "Iam a user";
        StringBuilder reverse = reverse(s);
        System.out.println(reverse);
    }

    public static StringBuilder reverse(String s) {
        String c[] = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s1 : c) {
            for (int i = s1.length() - 1; i >= 0; i--) {
                sb.append(s1.charAt(i));
            }
            sb.append(" ");
        }
        return sb;
    }
}
