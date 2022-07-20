package AAAtodo;

public class ValidPalindrome {
    public static void main(String[] args) {
        //String s = "race a car";
        //String s = "A man, a plan, a canal: Panama";
        String s = " ";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {

        String s2 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s2.isEmpty()) {
            return true;
        }
        int startI = 0;
        int endI = s2.length() - 1;
        char start = s2.charAt(0);
        char end = s2.charAt(s2.length() - 1);
        while (startI <= endI) {
            if (start == end) {
                startI++;
                endI--;
                start = s2.charAt(startI);
                end = s2.charAt(endI);
                System.out.println("start " + start + " end " + end);
            } else {
                return false;
            }
        }
        return true;
    }
}
