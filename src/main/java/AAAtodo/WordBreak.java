package AAAtodo;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
      //  wordBreak(s,wordDict);
    }
/*    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] f = new boolean[s.length() + 1];

        f[0] = true;


        *//* First DP
        for(int i = 1; i <= s.length(); i++){
            for(String str: dict){
                if(str.length() <= i){
                    if(f[i - str.length()]){
                        if(s.substring(i-str.length(), i).equals(str)){
                            f[i] = true;
                            break;
                        }
                    }
                }
            }
        }*//*

        //Second DP
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];
    }*/
}
