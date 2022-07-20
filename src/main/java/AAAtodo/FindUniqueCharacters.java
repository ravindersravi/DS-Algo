package AAAtodo;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueCharacters {
    public static void main(String[] args) {
        String s = "abbca";
        long l = appealSum(s);
        System.out.println(l);
    }
    public static long appealSum(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        char c[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(c[i])){
                hm.put(c[i], hm.get(c[i]));
            }
            else {
                hm.put(c[i],1);
            }
        }
        int count =0;
        for(Map.Entry<Character,Integer> g: hm.entrySet()){
            if(g.getValue()==1){
                count++;
            }
        }
        return count;
    }
}
