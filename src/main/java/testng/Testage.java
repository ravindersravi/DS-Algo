package testng;

import java.time.LocalDate;

public class Testage {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        String year = Integer.toString(today.getYear());
        String kycDob = "11-13-1995";
        String yearFromKyc = kycDob.substring(6, 10);
        int kycYear = Integer.parseInt(yearFromKyc);
        int currentYear = Integer.parseInt(year);
       int ageInYear = currentYear - kycYear;
        System.out.println(ageInYear);
    }
}
