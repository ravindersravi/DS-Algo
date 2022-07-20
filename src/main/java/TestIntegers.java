import java.util.Optional;

public class TestIntegers {
    public static void main(String[] args) {
        String s = null;
        Integer l0ThickV5Score = Optional.ofNullable(Integer.parseInt(String.valueOf(s.length()))).orElse(null);
        System.out.println(l0ThickV5Score);
    }
}
