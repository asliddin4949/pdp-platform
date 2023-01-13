package Lesson3;

import java.time.Duration;
import java.time.LocalTime;

public class Task2 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(11, 21, 33);
        duration(localTime);
    }

    public static void duration(LocalTime localTimeEntered) {
        LocalTime localTimeNow = LocalTime.now();
        if (localTimeEntered.isBefore(localTimeNow)) {
            var between = Duration.between(localTimeEntered, localTimeNow);
            System.out.println(between.toHoursPart() + ":" + between.toMinutesPart() + ":" + between.toSecondsPart());

        } else {
            var between = Duration.between(localTimeNow, localTimeEntered);
            System.out.println(between.toHoursPart() + ":" + between.toMinutesPart() + ":" + between.toSecondsPart());
        }
    }
}
