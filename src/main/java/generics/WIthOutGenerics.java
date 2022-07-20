package generics;

import java.util.ArrayList;
import java.util.List;

public class WIthOutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello-world");
        String s = (String) list.get(0);
        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        String s2 = list2.get(0);   // no cast
        /*
        The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
         */
    }
}
