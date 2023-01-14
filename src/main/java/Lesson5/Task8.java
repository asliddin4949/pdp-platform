package Lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/oxford.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(file);

    }
}
