package Lesson3;

import java.time.LocalDate;
import java.time.Period;

public class Task3 {
    public static void main(String[] args) {
        ageMonthDay(1996,12,2);
    }

    public static void ageMonthDay(int year, int month, int day) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate,today);
        System.out.println("Age: " + age.getYears()
                + "\nMonth: " + age.getMonths()
                + "\nDays: " + age.getDays());
    }
}
