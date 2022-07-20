package ADynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class TOH2 {
    static List<int[]> moves;      //N plates  n moves //3plates // 3 moves  n,n+1,n+2

    public static void main(String[] args) {
        System.out.println(shiftPile(3,3));
    }
    static List<Integer> shiftPile(int N, int n){
        moves = new ArrayList<>();
        towerOfHanoi(N, 1, 2, 3);
        List<Integer> ans = new ArrayList<>();
        ans.add(moves.get(n - 1)[0]);
        ans.add(moves.get(n - 1)[1]);
        return ans;
    }
    static void towerOfHanoi(int N, int from, int aux, int to) {
        if (N <= 0) {
            return;
        }
        towerOfHanoi(N - 1, from, to, aux);
        moves.add(new int[]{from, to});
        towerOfHanoi(N - 1, aux, from, to);
    }
}
