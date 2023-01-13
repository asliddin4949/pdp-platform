package Lesson4.task1;

public class NoTextException extends Throwable {
    public NoTextException() {
        super("Kiritilgan matn bo'sh bolmasligi kerak!");
    }
}
