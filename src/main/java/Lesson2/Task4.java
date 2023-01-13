package Lesson2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int year = 2023;

        GregorianCalendar calendar = new GregorianCalendar(year, 0, 1);
        int fridayCount = 0;

        while (true) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                fridayCount++;
                if (fridayCount == 10) {
                    System.out.println(calendar.getTime());
                    break;
                }
                calendar.add(Calendar.DAY_OF_YEAR, 1);
            } else {
                calendar.add(Calendar.DAY_OF_YEAR, 1);
            }
        }
    }
}