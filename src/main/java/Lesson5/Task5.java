package Lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/Asliddin/Desktop/Files/sanjar/asliddin.txt");
        System.out.println(getMaxLength(file));
    }
    public static String getMaxLength(File file) throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        List<String> strings = reader.lines().toList();
        String maxLength = "";
        for (String string : strings) {
            String str = "";
            string = string +" ";
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != ' ') {
                    str = str + string.charAt(i);
                } else {
                    if (str.length() > maxLength.length()) {
                        maxLength = str;
                    }
                    str = "";
                }
            }
        }
        return maxLength;
    }
}
