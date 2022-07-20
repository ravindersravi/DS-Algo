import org.springframework.beans.factory.annotation.Autowired;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeTesting {

    @Autowired
    static  Clock clock;

    public static void main(String[] args) {
       // ZonedDateTime today = ZonedDateTime.now();
      //  System.out.println(today);
        try {
            String kycDob = "test";
            String yearFromKyc = kycDob.substring(6, 10);
            System.out.println(yearFromKyc);
        }catch (Exception e ){
            System.out.println(e);
        }

    }
}
