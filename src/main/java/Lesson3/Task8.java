package Lesson3;

import java.time.LocalDate;

public class Task8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 2, 03);
        infoCurrentMonth(date);
    }

    public static void infoCurrentMonth(LocalDate date) {
        System.out.println("Joriy oy tartib raqami: " + date.getMonthValue() +
                "\nOyning davomiyligi: " + date.lengthOfMonth() +
                "\nOyning maksimal davomiyligi: " + date.getMonth().maxLength() +
                "\nKvartalning birinchi oyi: " + date.getMonth().firstMonthOfQuarter() +
                "\nOyning nomi: " + date.getMonth());
    }
}
