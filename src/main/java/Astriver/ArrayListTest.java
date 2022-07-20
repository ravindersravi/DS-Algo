package Astriver;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        result.add(12);
        result.add(3);
        System.out.println(result);

        ArrayList<Integer> r = new ArrayList<>(result.get(1));
        System.out.println(r);

    }
}
