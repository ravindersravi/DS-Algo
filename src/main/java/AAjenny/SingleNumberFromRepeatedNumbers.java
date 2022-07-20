package AAjenny;

import java.util.HashSet;

public class SingleNumberFromRepeatedNumbers {
    public static void main(String[] args) {
        int n[] = {2,2,1};
        int process = process(n);
        System.out.println(process);
    }
    static int process(int a[]){
        HashSet<Integer> integerHashSet = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(integerHashSet.contains(a[i])){
                integerHashSet.remove(a[i]);
            }
            integerHashSet.add(a[i]);
        }
        return integerHashSet.iterator().next();
    }
}
