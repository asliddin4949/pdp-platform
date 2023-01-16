package Lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/main/resources/oxford.txt"));
        HashMap<String, String> oxfordList = new HashMap<>();
        oxfordList.put(scanner.next(), scanner.nextLine());
        while (scanner.hasNext() && scanner.hasNextLine()) {
            oxfordList.put(scanner.next(), scanner.nextLine());
        }
        String word = "Abnegate";
        System.out.println(word + " - > " + oxfordList.get(word));

    }
}
