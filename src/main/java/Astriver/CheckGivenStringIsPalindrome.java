package Astriver;

public class CheckGivenStringIsPalindrome {
    public static void main(String[] args) {
        String s = "dockcod";
        int i=0;

        boolean string = findString(s, i);
        System.out.println(string);
    }
    static boolean findString(String s, int i){
        int n =s.length();
        if(i>=n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return findString(s,i+1);
    }
}
