package Lesson3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) {

        date();
        time();

    }
    public static void date(){
        System.out.println(LocalDate.now());
    }
    public static void time(){
        System.out.println(LocalTime.now());
    }
}
