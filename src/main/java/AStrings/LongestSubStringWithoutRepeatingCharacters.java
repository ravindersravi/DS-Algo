package AStrings;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    public static int lengthOfLongestSubstring(String s) {
    if(s.length()==0) return 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int max=0;
        for(int i=0,j=0;i<s.length();++i){
            if(hashMap.containsKey(s.charAt(i))){
                j=Math.max(j,hashMap.get(s.charAt(i)+i));
            }
            hashMap.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
