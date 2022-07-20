package AHubber.arrays;

public class PalimdromeString {
    public static void main(String[] args) {
        String s = "madam";
        boolean palindrome = isPalindrome(s);
        System.out.println("Given String is plaindrome ? :"+palindrome);
    }
    public static boolean isPalindrome(String word){
        char[] chars = word.toCharArray();
        int start =0;
        int end = word.length()-1;
        while (start<end){
            if(chars[start]!=chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
