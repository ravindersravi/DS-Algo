package AAAtodo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);
        int a[] = new int[2];
       // Object firstKey = map.keySet().toArray()[0];
      //  Object valueForFirstKey = map.get(firstKey);
        for(int i=0;i<2;i++){
          //  a[i]= (int) map.keySet().toArray()[i];
            a[i]= (int) map.get(map.keySet().toArray()[i]);
        }
        System.out.println(Arrays.toString(a));

    }
}
