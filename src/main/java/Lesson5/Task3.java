package Lesson5;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {


        File file = new File("src/main/java");
        searchFiles(file, "ask");

    }

    public static void searchFiles(File file, String fileName) {
        if (file.getName().contains(fileName)){
            System.out.println(file);
        }
        for (File listFile : file.listFiles()) {
            var files = listFile.listFiles();
            if (files == null) {
                if (listFile.getName().contains(fileName) && (listFile.isDirectory() || listFile.isFile())) {
                    System.out.println(listFile);
                }
            } else {
                searchFiles(listFile, fileName);
            }
        }
    }
}
