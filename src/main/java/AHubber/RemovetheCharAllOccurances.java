package AHubber;

import java.util.HashSet;

public class RemovetheCharAllOccurances {
    public static void main(String[] args) {
        String s1 = "india";
        String s2 = "in";
        StringBuilder s = removegivenChar(s1, s2);
        System.out.println(s);
    }

    public static StringBuilder removegivenChar(String s1, String s2) {
        char c1[] = s1.toCharArray();  //5
        char c2[] = s2.toCharArray(); //2
        HashSet<Character> hs = new HashSet<>();

        for (int j = 0; j < c2.length; j++) {
            hs.add(c2[j]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c1.length; i++) {
            if (!hs.contains(c1[i])) {
                sb.append(c1[i]);
            }
        }
        return sb;
    }
}
