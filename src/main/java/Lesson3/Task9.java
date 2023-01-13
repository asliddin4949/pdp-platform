package Lesson3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task9 {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        getDateAndTime(dateTime);
    }

    public static void getDateAndTime(LocalDateTime dateTime) {

        System.out.println(dateTime.toLocalDate());
        System.out.println(dateTime.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
    }
}
