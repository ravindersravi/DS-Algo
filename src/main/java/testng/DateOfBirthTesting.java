package testng;

import java.time.LocalDate;

public class DateOfBirthTesting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String bday = null;

        String dob = "1993-08-09T00:00:00";
        String year =Integer.toString( today.getYear());
        System.out.println(dob.substring(0,year.length()));
        try {
             bday = dob.replaceAll(dob.substring(0, year.length()), year);
        }catch (Throwable e) {
            System.out.println("throus exception");
        }
        System.out.println(bday);
    }
}
