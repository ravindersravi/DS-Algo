package AAAtodo;

import java.util.Arrays;

public class Arraysmethods {
    public static void main(String[] args) {
        String[] aArray = new String[5];
        String[] bArray = {"a","b","c", "d", "e"};
        String[] cArray = new String[]{"a","b","c","d","e"};

      //  Arrays.sort(aArray);
        Arrays.fill(bArray,"Data");
      //  Arrays.toString(aArray);
      //  Arrays.parallelSort(aArray);

        char c[][] = new char[3][3];
        for(char[] c1: c){
            Arrays.fill(c1,'r');
        }
        Arrays.stream(c).sequential().forEach(System.out::println);


    }
}
