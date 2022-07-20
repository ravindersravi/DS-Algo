package hashmaps;

import epam.Inte;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddElements {
    //Integer.MAX_VALUE, Integer.MIN_VALUE;
    public static void main(String[] args) {
        Map<String, String > map = new HashMap(){{
            put("key1","value1");
            put("key2","value2");
        }};

        for(Map.Entry<String,String> entry: map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key "+key);
            System.out.println("value "+value);
        }

        //Iterating keyset of hashmap
        Set<String> keys = map.keySet();
        for(String key: keys){
            String value = map.get(key);
            System.out.println(value);
        }
        Collection<String> values = map.values();
        for (String v: values){
            System.out.println(v);
        }
    }
}
