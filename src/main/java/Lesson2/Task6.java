package Lesson2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task6 {

    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat dateFormat2 = new SimpleDateFormat("d'/'M'/'yy h':'mm a");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("h':'mm':'ss a");
        SimpleDateFormat dateFormat4 = new SimpleDateFormat("MMM d',' yyyy h':'mm':'ss a");
        SimpleDateFormat dateFormat5 = new SimpleDateFormat("h':'mm a");
        SimpleDateFormat dateFormat7 = new SimpleDateFormat("h':'mm a z");
        SimpleDateFormat dateFormat9 = new SimpleDateFormat("MMM d',' yyyy h':'mm a");
        SimpleDateFormat dateFormat10 = new SimpleDateFormat("MMMM d',' yyyy h':'mm':'ss a z");
        System.out.println(date);
        System.out.println(dateFormat2.format(date));
        System.out.println(dateFormat3.format(date));
        System.out.println(dateFormat4.format(date));
        System.out.println(dateFormat5.format(date));
        System.out.println(dateFormat7.format(date));
        System.out.println(dateFormat9.format(date));
        System.out.println(dateFormat10.format(date));


    }
}
