package AAudemy;

import java.util.Arrays;

public class Nemo {
    public static void main(String[] args) {
        String[] nemo = {"nemo"};
        String[] everyone = {"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank"};
        String[] large = new String[100000];
        Arrays.fill(large, "nemo");
        findNemo(large);
    }

    static void findNemo(String[] nemo) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < nemo.length; i++) {
            if (nemo[i] == "nemo") {
                System.out.println("Found NEMO!");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Call to find Nemo took " + (end - start) + " milliseconds.");
    }
}


