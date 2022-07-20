package dto.exceptionTest;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Devide {
    @SneakyThrows(value = FileNotFoundException.class)
    public static void main(String[] args) {

        FileInputStream fis = new FileInputStream("user.txt");
    /*    String s;
        s = null;
      //  System.out.println(s.length());
        int a = 10/0;
      //  System.out.println(a);
        System.out.println("after the exception");*/
        int b = 12/4;
        System.out.println(b);

        System.out.println(process());

    }
    public static String process(){
        System.out.println("inside of process");
        return "demo";
    }

}
