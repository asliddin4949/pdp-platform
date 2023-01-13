package Lesson3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task4 {
    public static void main(String[] args) {

        lastNextSunday();

    }

    public static void lastNextSunday() {

        LocalDate nextSunday = LocalDate.now();
        LocalDate lastSunday = LocalDate.now();
        while (true) {
            lastSunday = lastSunday.minus(1, ChronoUnit.DAYS);
            if (lastSunday.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                System.out.println(lastSunday.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
                break;
            }
        }
        while (true) {
            nextSunday = nextSunday.plus(1, ChronoUnit.DAYS);
            if (nextSunday.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                System.out.println(nextSunday.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
                break;
            }
        }

    }

}
