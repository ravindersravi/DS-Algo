package ADynamicPrograming;

public class NaivePatternSearching {
    public static void main(String[] args) {
       // String pat = "AABAACAADAABAAABAA";
      //  String txt = "AABA";

        String  pat= "GEEKS FOR GEEKS";
        String txt = "GEEK";


        search(pat,txt);
    }
    static  void search(String pat, String txt){
        int l1 = pat.length();
        int l2= txt.length();
        int i=0, j=l2-1;

        for(i=0,j=l2-1;j<l1;){
            if(txt.equals(pat.substring(i,j+1))){
                System.out.println("Pattern found at index "+i);

            }
            i++;
            j++;
        }




    }
}
