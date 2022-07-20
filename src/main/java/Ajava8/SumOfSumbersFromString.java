package Ajava8;

public class SumOfSumbersFromString {
    public static void main(String[] args) {
        String s[] = {"2AA","12","ABC", "c1a1"};
        int count=0;
        for(int i=0;i<s.length;i++) {
            String s1= s[i];
            for(int j=0;j<s1.length();j++){
                if(Character.isDigit(s1.charAt(j))){
                    count= count+ Integer.parseInt(s1.charAt(j)+"");
                }
            }
        }
        System.out.println(count);
    }
}
