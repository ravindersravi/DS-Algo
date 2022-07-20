package AGFG;

import java.util.HashMap;
import java.util.Map;

public class FIndElementAppearOnlyOnce {
    public static void main(String[] args) {
        int ar[] = {7, 3, 5, 4, 5, 3, 4};
        int i = elementOnce(ar);
        System.out.println(i);

    }

    public static int elementOnce(int[] a) {
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
                break;
            }
        }

        return res;
    }
}
