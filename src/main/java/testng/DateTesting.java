package testng;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTesting {
    public static void main(String[] args)  {
        String dob = "01-07-1985";
        System.out.println(dob.substring(6, 10));

        System.out.println("dfgfgfdg");



        SimpleDateFormat format11 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat format21 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
             date1 = format11.parse(dob);

        }
        catch (Exception pe){
            System.out.println("count not able to parse");
        }
        System.out.println("oustide ");
        System.out.println(date1);
      //  System.out.println(format21.format(date1));
        System.out.println("--------------------------");

        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
     /*
        Date date = format1.parse("05/01/1999");
        System.out.println(format2.format(date));*/
    }
}
