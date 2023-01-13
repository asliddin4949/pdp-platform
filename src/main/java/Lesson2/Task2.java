package Lesson2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task2 {

    public static void main(String[] args) {


        GregorianCalendar calendar = new GregorianCalendar(2023, 0, 1);

        System.out.println(calendar.getTime());
        int count = 0;
        while (count < 20) {

            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                count++;
            }
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }
        System.out.println(calendar.getTime());
    }

}
