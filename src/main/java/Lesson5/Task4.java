package Lesson5;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("/Users/Asliddin/Desktop/Files/sanjar/asliddin.txt");
        System.out.println(lines(file));
    }

    public static int lines(File file) {
        int lines = 0;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            var line = reader.readLine();
            while (line != null) {
                lines++;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
