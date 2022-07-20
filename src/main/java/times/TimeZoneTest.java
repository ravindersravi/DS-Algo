package times;


import java.time.Clock;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimeZoneTest{
    public static void main(String[] args) {
        ZonedDateTime current = ZonedDateTime.now().minusHours(3);
        ZonedDateTime afterAnhour = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(current);
        System.out.println(afterAnhour);
        System.out.println(ChronoUnit.HOURS.between(current,afterAnhour));

    }
}