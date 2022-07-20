package dto.Cleancode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTesting {
   static int  a[]   = {};
    static List<String> al = new ArrayList<String>();


    public static void main(String[] args) {
        System.out.println(a.length);
        System.out.println("adffa");
        test(a, al);
    }

    public static void test(int a[], List<String> al) {
        List<String> alList =al.stream().map(a1->a1.substring(0,2)).collect(Collectors.toList());
        System.out.println(alList.contains("admin"));
       // System.out.println(al.contains("user"));
//        if (a == null) {
//            System.out.println("empty");
//        }
//        else if(al==null ){
//            System.out.println("elsee");
//        }
       /* else {
            al.contains("ravi");
        }*/
    }
}
