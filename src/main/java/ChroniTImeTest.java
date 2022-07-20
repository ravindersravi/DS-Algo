import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ChroniTImeTest {
    public static void main(String[] args) {

         final int timeCutofInHours = 500;

        LocalDate now = LocalDate.now(ZoneOffset.UTC);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(2018, 01, 01, 0, 0, 0, 0, ZoneId.of("UTC"));
        System.out.println("zoned date time"+zonedDateTimeOf);
        System.out.println("now : "+now);
        LocalDate emailCreatedOn = LocalDate.now(ZoneOffset.UTC).plusDays(2);
        System.out.println("created : "+emailCreatedOn);
      //  long between = ChronoUnit.HOURS.between(emailCreatedOn, now);

      //  System.out.println(between);
      //  boolean b = ChronoUnit.HOURS.between(emailCreatedOn, now) < timeCutofInHours;
      //  System.out.println(b);
    }
}
