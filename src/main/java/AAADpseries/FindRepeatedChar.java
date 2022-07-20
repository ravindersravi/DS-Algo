package AAADpseries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatedChar {
    public static void main(String[] args) {
        String s = "india";
        ArrayList<Character> repeated = repeated(s);
        repeated.stream().forEach(System.out::println);
    }
    public static ArrayList<Character> repeated(String s){
        ArrayList<Character> a= new ArrayList<>();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i), 1);
            }
            else
                hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
        }
        for(Map.Entry<Character,Integer>h : hmap.entrySet()){
           if( h.getValue()!=1)
           {
               a.add(h.getKey());
           }
        }
        return a;
    }
}
