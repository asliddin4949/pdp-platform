package Lesson3;


import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Set;
import java.util.TimeZone;

public class Task10 {
    public static void main(String[] args) {

        ZonedDateTime dateTime = ZonedDateTime.now();
        allTimeZones(dateTime);
    }
    public static void allTimeZones(ZonedDateTime dateTime){
        var availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(dateTime.withZoneSameInstant(ZoneId.of(availableZoneId)));
        }
    }
}
