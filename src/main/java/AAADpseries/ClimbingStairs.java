package AAADpseries;

public class ClimbingStairs {
    public static void main(String[] args) {
        int N = 4;
        int climb = climb(0, N, new int[N + 1]);
        System.out.println(climb);
    }

    //Top down approach, Memoaization technique
    public static int climb(int currentIndex, int target, int[] cache) {
        if (currentIndex == target) return 1;
        if (currentIndex > target) return 0;
        if (cache[currentIndex]!=0){
            return cache[currentIndex];
        }else {
            int oneStep = climb(currentIndex+1,target, cache);
            int twoStep = climb(currentIndex+2,target, cache);
            cache[currentIndex]= oneStep+twoStep;
            return oneStep+twoStep;
        }
    }
}
