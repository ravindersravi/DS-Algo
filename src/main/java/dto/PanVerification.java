package dto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;

public class PanVerification {

    static boolean check(Vector<String> l, String s1)
    {
        ArrayList<String> list = new ArrayList<>();
        for(String list1 : l) {
            list.add(list1.toLowerCase(Locale.ROOT));
        }
        String s = s1.toLowerCase(Locale.ROOT);
        int n = (int) list.size();
        // If the array is empty
        if (n == 0)
        {
            return false;
        }

        for (int i = 0; i < n; i++)
        {
            // If sizes are same
            if (list.get(i).length() != s.length())
            {
                continue;
            }

            boolean diff = false;
            for (int j = 0; j < (int) list.get(i).length(); j++)
            {
                if (list.get(i).charAt(j) != s.charAt(j))
                {
                    // If first mismatch
                    if (!diff)
                    {
                        diff = true;
                    }
                    // Second mismatch
                    else
                    {
                        diff = false;
                        break;
                    }
                }
            }
            if (diff) {
                return true;
            }
        }

        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        Vector<String> s = new Vector<>();
       // s.add("banana");
        s.add("apple");
        s.add("banacb");
        s.add("ban123aba");
        s.add("aa234nana");
        s.add("bonanza");
        s.add("banamf");

        System.out.println(check(s, "BAN123ANA") == true ? 1 : 0);
    }
}
