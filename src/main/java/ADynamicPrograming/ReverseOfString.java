package ADynamicPrograming;

public class ReverseOfString {
    public static void main(String[] args) {
        String s = "yoda is a jedi";
        String reverse = reverse(s);
        System.out.println(reverse);
        String reverse1 = reverseofWords(s);
        System.out.println(reverse1);
    }
    static String reverse(String s){  //idej a si adoy
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            s1=s1+c;
        }
        return s1;
    }
    static String reverseofWords(String s){  //jedi a is yoda
        String words[]=s.split("\\s");
        String newdata = "";
        String data1;
        for(int i=words.length-1;i>=0;i--){
          data1 = words[i]+ " ";
          newdata+=data1;
        }
        return newdata;
    }
}
