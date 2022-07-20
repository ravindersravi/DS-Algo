package Astriver;

import java.util.ArrayList;
import java.util.List;

public class CalculateNumberOfSubsets {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        List<List<Integer>> subsets = subsets(a);
        for(List<Integer> integerList: subsets){
            for(Integer i1: integerList){
                System.out.print(i1+" ");
            }                System.out.println(" __");

        }

    }
    public static List<List<Integer>>  subsets(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        System.out.println(result);
        for(int x: nums){
            int n= result.size();
            for(int i=0;i<n;++i){
                ArrayList<Integer> r = new ArrayList<>(result.get(i));
                System.out.println("r : "+r+" i :"+i);
                r.add(x);
                result.add(r);
                System.out.println("result :"+result);
            }
        }
        return result;
    }
}
