package AAjenny;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Admin World";
        int i = lengthOfLastWord(s);
        System.out.println("length of last word "+i );
    }
    public static int lengthOfLastWord(String s) {
      /*  s=s.replaceAll("[^a-zA-Z0-9]"," ");
        char ch[] = s.toCharArray();
        int l = ch.length-1;
        return ch[l];
*/
        System.out.println(s.trim());
        System.out.println(s.trim().length());
        System.out.println(s.trim().lastIndexOf("m"));
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}

