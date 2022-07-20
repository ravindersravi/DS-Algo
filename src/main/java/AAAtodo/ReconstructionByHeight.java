package AAAtodo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/queue-reconstruction-by-height/
public class ReconstructionByHeight {
    public static void main(String[] args) {
        int [][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
     //   Output: {{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}}
        int[][] ints = reconstructQueue(people);
        Arrays.stream(ints).forEach((i) -> {
            Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
            System.out.println();
        });
    }
    public static int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0)
            return new int[0][0];

        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[0] == a[0]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });

        int n = people.length;
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++)
            tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});

        int[][] res = new int[people.length][2];
        int i = 0;
        for (int[] k : tmp) {
            res[i][0] = k[0];
            res[i++][1] = k[1];
        }

        return res;
    }

}
