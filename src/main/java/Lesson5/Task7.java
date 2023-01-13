package Lesson5;

import java.io.*;

public class Task7 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src/main/java/Lesson5/Task5.java");
        File file2 = new File("src/main/java/Lesson5/Task6.java");
        File file3 = new File("src/main/resources/newFile.txt");
        file3.createNewFile();
        FileReader fileReader1 = new FileReader(file1);
        FileReader fileReader2 = new FileReader(file2);
        BufferedReader reader1 = new BufferedReader(fileReader1);
        BufferedReader reader2 = new BufferedReader(fileReader2);

        FileWriter writer1 = new FileWriter(file3, true);
        writer1.flush();
        for (String s : reader1.lines().toList()) {
            writer1.write(s);
            writer1.write("\n");
        }
        for (String s : reader2.lines().toList()) {
            writer1.write(s);
            writer1.write("\n");
        }
        writer1.close();
    }
}
