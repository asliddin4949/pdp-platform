package Lesson5;

import java.io.File;


public class Task2 {
    public static void main(String[] args) {

        whatsInPath("src/main/java/Lesson5");
        whatsInPath("src/main/java/Lesson3");
        whatsInPath("src/main/resources");

    }

    public static void whatsInPath(String path) {
        File file = new File(path);
        var files = file.listFiles();
        boolean isFiles = false;
        boolean isDirectories = false;
        if (files == null) {
            System.out.println("Papka bo'sh!");
        } else {
            for (File file1 : files) {
                if (file1.isFile()) {
                    isFiles = true;
                }
                if (file1.isDirectory()) {
                    isDirectories = true;
                }
            }

            if (isFiles && isDirectories) {
                System.out.println("Papka va Fayllar bor");
            } else if (isFiles && !isDirectories) {
                System.out.println("Fayllar bor");
            } else {
                System.out.println("Papkalar bor");
            }
        }

    }
}
