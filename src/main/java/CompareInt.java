import java.util.*;
import java.util.stream.Collectors;

public class CompareInt {
    private  static
    final int val = 96;
    public static void main(String[] args) {
        List<String> animalWithNullElements =null;
      //  animalWithNullElements.add(0, null);
       // animalWithNullElements.add(1, "Guybrush Threepwood");
      //  animalWithNullElements.add(2, "fghfhfg");
        System.out.println(filterList(animalWithNullElements));
       /* List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,12,23,234,32,345,35,34,23);
        List<Integer> ls = list.stream().filter(a->a>=val).collect(Collectors.toList());
        System.out.println(ls);*/
    }


    private static List<String> filterList(List<String> animals) {
        return Optional.ofNullable(animals)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
