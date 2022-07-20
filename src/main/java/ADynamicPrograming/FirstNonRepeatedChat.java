package ADynamicPrograming;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChat {
    public static void main(String[] args) {
        String c = "india";
        //find first non repeated char
        char c1 = nonRepeatedChar(c);
        System.out.println(c1);
    }

    static char nonRepeatedChar(String c) {
        HashMap<Integer, Character> hm = new HashMap<>();
        for (int i = 0; i < c.length(); i++) {
            if (hm.containsKey(c.charAt(i))) {
                hm.put(hm.get(c.charAt(i)) + 1, c.charAt(i));
            } else {
                hm.put(1, c.charAt(i));
            }
        }
        for (Map.Entry<Integer, Character> entry : hm.entrySet()) {
            if (entry.getKey() == 1) {
                return entry.getValue();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }

}
