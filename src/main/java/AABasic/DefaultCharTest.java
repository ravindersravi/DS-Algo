package AABasic;

public class DefaultCharTest {
    public static void main(String[] args) {
        String s = "inida";
        char aChar = findChar(s);
        System.out.println(aChar);
    }
    static char findChar(String s){
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='i'){
                return ch[i];
            }
        }
        return 0;
    }
}
