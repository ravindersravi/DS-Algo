package Astriver;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationBackTracking {
    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        permutation(input);
    }

    public static void permutation(int[] input) {
        Arrays.sort(input);
        permutation(input, new ArrayList<>(), new boolean[input.length]);
    }

    public static void permutation(int input[], ArrayList<Integer> partitial, boolean[] used) {
        if (partitial.size() == input.length) {
            System.out.println(Arrays.toString(partitial.toArray()));
            return;
        }
        for (int i = 0; i < input.length; i++) {
            if (!used[i] && (i > 0 && input[i] != input[i - 1] && !used[i - 1])) {
                used[i] = true;
                partitial.add(input[i]);
                permutation(input, partitial, used);
                used[i] = false;
                partitial.remove(partitial.size() - 1);
            }
        }
    }

}
