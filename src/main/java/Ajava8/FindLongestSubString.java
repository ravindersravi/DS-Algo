package Ajava8;

import java.util.HashSet;

public class FindLongestSubString {
    public static void main(String[] args) {
        String str = "abcdab"; //abcd valid bcda also valid
        //sub string without repetation of char
        //if multiple substrings present we need to return 1st longest sub string.

        String longest = longest(str);
        System.out.println(longest);
    }
    public static String longest(String str){
        HashSet<Character> set = new HashSet<>();
        String longestOverall = "";
        String longestTillNow = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(set.contains(c)){
                longestTillNow="";
                set.clear();
            }
            set.add(c);
            longestTillNow+=c;
            if(longestTillNow.length()>longestOverall.length()){
                longestOverall=longestTillNow;
            }
        }

        return longestOverall;
    }
}
