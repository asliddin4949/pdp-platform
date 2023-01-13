package Lesson3;

import java.time.LocalDate;
import java.time.Period;

public class Task5 {
    public static void main(String[] args) {
        months();
    }

    public static void months() {
        LocalDate localDate = LocalDate.now();
        System.out.println(12-localDate.getMonthValue());
    }
}
