package Lesson2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task3 {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        int year = 2023;
        calendar.set(year, 0, 01);
        int countWorkingDay = 0;
        int countDayOff = 0;
        while (calendar.get(Calendar.YEAR) < (year + 1)) {
            if(calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY){
                countWorkingDay++;
            }else {
                countDayOff++;
            }
            calendar.add(Calendar.DAY_OF_YEAR,1);
        }

        System.out.println("Working Days: "+ countWorkingDay);
        System.out.println("DayOffs: "+ countDayOff);


    }


}
