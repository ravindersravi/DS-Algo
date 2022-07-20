package AAAtodo;

import epam.Inte;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> permute = permute(nums);
        permute.stream().forEach(a->a.forEach(System.out::print));
    }
    public static List<List<Integer>> permute(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean []freq = new boolean[nums.length];
        recurPermute(nums, ans,ds,freq);
        return ans;
    }
    public static void recurPermute(int [] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq ){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(!freq[i]){
                freq[i]= true;
                ds.add(nums[i]);
                recurPermute(nums, ans, ds, freq);
                ds.remove(ds.size()-1);
                freq[i]= false;
            }
        }
    }
}
