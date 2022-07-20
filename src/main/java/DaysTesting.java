import lombok.Value;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DaysTesting {
    public static void main(String[] args) {
       // @Value("${negative_screening:90}")
        Long defaultExpiryInDays =90L;

        final LocalDateTime utc = LocalDateTime.now(ZoneId.of("UTC")).minusDays(defaultExpiryInDays);
        System.out.println( "90 days past "+utc);

        String s= "ravi";
        //s.length().siz
        System.out.println(s);
        System.out.println();
    }
}
