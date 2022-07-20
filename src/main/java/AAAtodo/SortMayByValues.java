package AAAtodo;

import epam.Inte;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortMayByValues {
    public static void main(String[] args) {
        System.out.println("Sorting Using Java8 Stream");
        sortByJava8Stream();
    }
    public static void sortByJava8Stream(){
        Map<String, Integer> unSortedMap = getUnsortedMap();

        System.out.println("Unsorted Map "+unSortedMap);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x->sortedMap.put(x.getKey(), x.getValue()));

        System.out.println("Sorted Map   : " + sortedMap);

        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        System.out.println("Reverse Sorted Map   : " + reverseSortedMap);

    }
    private static  Map<String, Integer> getUnsortedMap(){
        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("alex",1);
        hmap.put("david",2);
        hmap.put("elle",3);
        hmap.put("charles",4);
        hmap.put("brain",5);
        return hmap;
    }
}
