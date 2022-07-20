package AAAtodo;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {


      //  String pattern= "abba";
    //    String s= "dog dog dog dog"; //false


        String pattern=    "abba";
        String s= "dog cat cat dog";
        boolean b = wordPattern(pattern, s);
        System.out.println(b);
    }
    public static boolean wordPattern(String pattern, String s) {
        if(pattern.length()==0 || s.length()==0) return false;
        char c[] = pattern.toCharArray();
        String s1[] = s.split(" ");
        HashMap<Character, String> hm = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (hm.containsKey(c[i]) && !hm.get(c[i]).equals(s1[i])) {
                return false;
            } else {
                hm.put(c[i], s1[i]);
            }
        }
        return true;
    }
}
