package Lesson4.task1;

public class Task1 {
    public static void main(String[] args) throws NoTextException {
        try {
            System.out.println(lengthString(""));
        } catch (NoTextException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int lengthString(String str) throws NoTextException {
        if (str.length() < 1) {
            throw new NoTextException();
        } else {
            return str.length();
        }
    }
}
