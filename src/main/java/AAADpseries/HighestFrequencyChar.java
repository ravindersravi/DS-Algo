package AAADpseries;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HighestFrequencyChar {
    public static void main(String[] args) {
        String s = "india";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        // Set<Map.Entry<Character,Integer>> entrySet = hm.entrySet();
        char mfc = s.charAt(0);

        for (Character key : hm.keySet()) {
            if(hm.get(key)>mfc){
                mfc= key;
            }
        }
        System.out.println(mfc);
    }

}
