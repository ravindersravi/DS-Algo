package AAAtodo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class partitionLabels {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> integerList = partitionLabels(s);
        integerList.stream().forEach(System.out::print);

    }
    public static List<Integer> partitionLabels(String s) {
        if (s == null || s.length() == 0) return null;

        List<Integer> outputArr = new ArrayList<>();
        int[] last_indices = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last_indices[s.charAt(i) - 'a'] = i;
            System.out.println(Arrays.toString(last_indices));
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last_indices[s.charAt(i) - 'a']);
            if (i == end) {
                outputArr.add(end - start + 1);
                start = end + 1;
            }
        }

        return outputArr;
    }
}
