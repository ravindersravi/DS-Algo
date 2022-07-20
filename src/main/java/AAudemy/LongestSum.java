package AAudemy;

import java.util.Scanner;

public class LongestSum {
    public static String LongestWord(String sen) {
        // code goes here
        sen.replaceAll("[^A-Za-z0-9]","");
        String s[] = sen.split(" ");
        int count =0;
        int max=0;
        for(int i=0;i<s.length;i++){
            int n = s[i].length();
            for(int j=0;j<n;j++){
                max++;
                if(max>count){
                    count=max;
                }
            }

        }
        return sen;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}
