package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IQ1 {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6};

        List<Integer> all= Arrays.asList(intArray)
                .stream().filter(a -> a % 2 ==0)
                .map(a->a*3)
                .collect(Collectors.toList());
        System.out.println(all);
        //even
        //multiply 3
        //store in list
    }
}
