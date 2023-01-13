package Lesson3;

import java.time.LocalDate;

public class Task7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.ofYearDay(2020,1);
        infoCurrentYear(date);
    }

    public static void infoCurrentYear(LocalDate date) {
        System.out.println("Joriy yil: "+date.getYear());
        System.out.println("Kabisa yilimi ? "+(date.isLeapYear() ? "Ha" : "Yo'q"));
        System.out.println("Yilning davomiyligi: "+date.lengthOfYear());
    }
}
