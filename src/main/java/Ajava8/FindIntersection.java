package Ajava8;

import java.util.HashSet;

public class FindIntersection {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {5,4,7,8};

        HashSet<Integer> hs  = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            if(hs.contains(b[j])){
                System.out.println(b[j]);
            }
        }

    }
}
