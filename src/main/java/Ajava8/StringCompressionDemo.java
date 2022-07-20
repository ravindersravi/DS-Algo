package Ajava8;

import java.util.HashMap;
import java.util.Map;

public class StringCompressionDemo {
    public static void main(String[] args) {
        String str = "sandeep";
        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
            else {
                hm.put(str.charAt(i),1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: hm.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb.toString());
    }
}
