public class DataPointes {
    public static void main(String[] args) {
        String s = "Ravi";
        Integer cibilScore = 123;
        Integer MIN_CIBIL_SCORE = 123;

        String s2 = "2342";
      //  String s1 = s.length() > 0 ? String.valueOf("123".equals("123")) : "234" : "324" : s2 ;

        Result b1=  cibilScore < MIN_CIBIL_SCORE ?
                cibilScore.equals(-1) ? Result.TRUE : Result.FALSE : Result.DEMo;
        System.out.println(b1);
        Integer i =1;
        if(100<90){
            i = 123;
        }
        if(i.equals(-1)){
            System.out.println("demi");
        }

    }
}

enum Result{
    TRUE,
    FALSE,
    DEMo

}