package AAneedClarity;

public class Decodeways {
    public static void main(String[] args) {
        int i = numDecodings("21622");
        System.out.println(i);
    }

    public static int numDecodings(String s) {

        int[] dp = new int[s.length() + 1];
        dp[0] = 1; //dp is going to store no of ways to decode a string of length x or y
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            System.out.println(i + " s.substring(i-1,i) : " + s.substring(i - 1, i));
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            System.out.println("oneDigit" + oneDigit);
            System.out.println(i + " s.substring(i-2,i): " + s.substring(i - 2, i));

            int twoDigits = Integer.valueOf(s.substring(i - 2, i));
            System.out.println("twoDigits" + twoDigits);
            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
                System.out.println("dp[i]" + dp[i]);
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
                System.out.println("dp[i]" + dp[i]);
            }
        }
        return dp[s.length()];
    }
}
