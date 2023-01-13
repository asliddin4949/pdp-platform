package Lesson2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        kabisaYili(calendar);
        calendar.set(Calendar.YEAR,2002);
        kabisaYili(calendar);
        calendar.set(Calendar.YEAR,2024);
        kabisaYili(calendar);

    }
    static void kabisaYili(Calendar calendar){
        if(calendar.get(Calendar.YEAR)%400==0||(calendar.get(Calendar.YEAR)%4==0&&calendar.get(Calendar.YEAR)%100!=0)){
            System.out.println(calendar.get(Calendar.YEAR)+" - Kabisa yili!");
        }else {
            System.out.println(calendar.get(Calendar.YEAR)+" - Kabisa yili emas!");
        }
    }
}
