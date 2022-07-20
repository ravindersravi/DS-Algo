package atpoint;

import java.util.regex.Pattern;

public class DataPattern {
    public static void main(String[] args) {
        String data = "ravinder";
        System.out.println(Pattern.matches("[0-9]+",data));
        System.out.println(data.substring(0,4));
    }
}
