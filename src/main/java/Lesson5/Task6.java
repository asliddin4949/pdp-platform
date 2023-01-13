package Lesson5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) throws IOException {
        File file = new File("Lesson5/Task6.java");
        File newFile = new File(  "src/main/resources/"+"copy-"+file.getName());
        newFile.createNewFile();
    }
}
