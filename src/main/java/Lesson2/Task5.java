package Lesson2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task5 {

    

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(2019, 0, 1);
        int dayOff = 0;
        while (calendar.get(Calendar.YEAR) < 2020) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                dayOff++;
            }
            if(calendar.get(Calendar.DAY_OF_MONTH)==Calendar.MARCH&&
                    (calendar.get(Calendar.DAY_OF_MONTH)==8||calendar.get(Calendar.DAY_OF_MONTH)==21)){
                dayOff++;
            }
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }
        System.out.println(dayOff);
    }
}
