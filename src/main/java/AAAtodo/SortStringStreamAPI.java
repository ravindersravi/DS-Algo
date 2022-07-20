package AAAtodo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortStringStreamAPI {
    public static void main(String[] args) {
        String randomString  = "adcbgekhs";
        String sortedChars = Arrays.stream(randomString.split(""))
                .sorted().collect(Collectors.joining());

        System.out.println(sortedChars);
    }



}
