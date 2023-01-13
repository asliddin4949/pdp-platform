package Lesson3;

import java.time.LocalDate;
import java.time.Period;


public class Task6 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 1, 7);
        LocalDate date2 = LocalDate.of(2023, 2, 13);
        periodDate(date1,date2);
    }

    public static void periodDate(LocalDate date1, LocalDate date2) {
        System.out.println(Period.between(date1, date2).getDays());
    }
}
