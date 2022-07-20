package AGFG.strings;

public class AllcharSameCheck {
    public static void main(String[] args) {
        String s = "same";
        allCharCheck(s);
    }
    static boolean allCharCheck(String s){
        int n = s.length();
        for(int i =1;i<n;i++){
            if(s.charAt(i)!=s.charAt(0))
                return false;
        }
        return true;
    }
}
