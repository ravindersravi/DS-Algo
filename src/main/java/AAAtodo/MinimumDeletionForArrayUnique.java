package AAAtodo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumDeletionForArrayUnique {
    public static void main(String[] args) {
        String s = "aab";
        minDeletions(s);
    }
    public static int minDeletions(String s) {
        int[] charCount = new int[26];

        for(char ch : s.toCharArray()){
            charCount[ ch - 'a'] ++;
        }

        HashSet<Integer> set = new HashSet<>();
        int deletion = 0;

        for(int val : charCount){
            while(val !=0 && set.contains(val)){
                val--;
                deletion++;
            }
            set.add(val);
        }

        return deletion;

    }
}


  /*HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

        }*/