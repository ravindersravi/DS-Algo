package AAAtodo;

public class LongestCommonSequence {
    public static void main(String[] args) {
     //   String s1= "ezupkr";
    //    String s2 = "ubmrapg";
        String s1=  "oxcpqrsvwf";
        String s2 =  "shmtulqrypy";
        int i = longestCommonSubsequence(s1, s2);
        System.out.println(i);
    }
   /* public static int longestCommonSubsequence(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for(int i = str1.length() - 1; i >= 0; i--){
            for(int j = str2.length() - 1; j >= 0; j--){
                if(str1.charAt(i) == str2.charAt(j))
                    dp[i][j] = dp[i+1][j+1] + 1;
                else
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        return dp[0][0];
    }*/
    public static int longestCommonSubsequence(String text1 , String text2) {
        if (text1.length() == 0 || text2.length() == 0) {
            return 0;
        }
        int a = 0;
        int count = 0;
        for (int i = 0; i < text1.length(); i++) {
            for (int j = a; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    count++;
                    a = j + 1;
                }
            }
        }
        return count;
    }
}
