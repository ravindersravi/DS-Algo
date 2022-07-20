package AAtutorialPoint;

public class ReverseAStringUsingRecursion {
    public static void main(String[] args) {
        String s = "ravi";
        int n = s.length()-1;

        String reverse = reverse(s, n);
        System.out.println(reverse);

        String s1 = "Welcome to Java World";
        String s2 = String.valueOf(reverseWords(s1));
        System.out.println(s2);
    }
    public static StringBuilder reverseWords(String s1){
        String s2 [] = s1.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=s2.length-1;i>=0;i--){
            stringBuilder.append(s2[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder;
    }
    public static String reverse(String s, int n){
       if(n<0) return "";
        return s.charAt(n)+reverse(s,n-1);
        /*
        if(s==null|| s.length()<=1 return s;
        return reverse(s.subString(s.substring(1))+s.charAt(0));
         */
    }
}
