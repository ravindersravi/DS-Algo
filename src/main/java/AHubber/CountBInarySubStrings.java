package AHubber;

public class CountBInarySubStrings {
    public static void main(String[] args) {
        String s = "11000110";
        int i = countBinary(s);
        System.out.println(i);
    }
    public static int countBinary(String s){
        int count =0, i=1, prev =0, curr =1;
        while (i<s.length()){
            if(s.charAt(i-1)!=s.charAt(i)){
                count+= Math.min(prev,curr);
                prev =curr;
                curr =1;
            }
            else{
                curr++;
            }
            i++;
        }
        return count+= Math.min(prev,curr);
    }
}
