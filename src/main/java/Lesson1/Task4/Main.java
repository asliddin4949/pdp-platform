package Lesson1.Task4;

public class Main {
    public static void main(String[] args) {
        Month month = Month.JULY;
        Season season = month.findSeason();
        System.out.println(season);
    }
}
