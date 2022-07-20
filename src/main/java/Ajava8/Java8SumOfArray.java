package Ajava8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8SumOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
        int sum1 = IntStream.of(a).sum();
        System.out.println(sum1);
        int asInt = Arrays.stream(a).reduce((x, y) -> x + y).getAsInt();
        System.out.println(asInt);
        int asInt1 = Arrays.stream(a).reduce(Integer::sum).getAsInt();
        System.out.println(asInt1);

        long count = Arrays.stream(a).summaryStatistics().getSum();
        System.out.println(count);
    }
}
