package AAAtodo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapHighestValue {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
       // find highest value in keyset java
        //countMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }
}
