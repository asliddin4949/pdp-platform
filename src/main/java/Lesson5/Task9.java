package Lesson5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Task9 {
    public static void main(String[] args) throws IOException {
        LocalDateTime dateTime = LocalDateTime.now();
        File newFile = new File("/Users/Asliddin/Desktop/" + dateTime.getYear());
        System.out.println(newFile.mkdir());
        File[] files = new File[12];
        for (int i = 1; i <= 12; i++) {
            LocalDate date = LocalDate.of(dateTime.getYear(), i, 1);
            files[i - 1] = new File(newFile.getPath() + "/" + date.getMonth());
            System.out.println(files[i - 1].mkdir());
           for (int j = 1; j <= date.getMonth().length(date.isLeapYear()); j++) {
                File file = new File(files[i - 1].getPath() + "/" + j + "." + date.getMonthValue() + "." + date.getYear() + ".txt");
                FileWriter writer = new FileWriter(file);
                writer.flush();
                writer.write(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
            }

        }
    }
}
