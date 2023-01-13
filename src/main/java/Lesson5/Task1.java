package Lesson5;

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        isFileOrDirectory("src/main/resources");
    }

    public static void isFileOrDirectory(String path) {
        File file = new File(path);
        if(file.isFile()){
            System.out.println("This path is file!");
        }
        if (file.isDirectory()){
            System.out.println("This path is directory!");
        }
    }
}
