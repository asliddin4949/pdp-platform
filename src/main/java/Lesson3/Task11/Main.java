package Lesson3.Task11;

import java.time.Duration;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.now();

        LocalTime endTime = startTime.plusMinutes(3);
        Svetofor currentColor = Svetofor.RED;

        boolean isFirstRed = true;
        boolean isFirstRed2 = true;

        boolean isFirstYellow = true;
        boolean isFirstYellow2 = true;

        boolean isFirstGreen = true;
        boolean isFirstGreen2 = true;

        LocalTime redColorTime = null;
        LocalTime yellowColorTime = null;
        LocalTime greenColorTime = null;

        while (startTime.isBefore(endTime)) {

            if (currentColor.equals(Svetofor.RED)) {

                if (isFirstRed) {
                    redColorTime = startTime.plusSeconds(4);
                    isFirstRed = false;
                }

                if (startTime.isBefore(redColorTime) && redColorTime != null) {
                    if (isFirstRed2) {
                        System.out.println("STOP");
                        isFirstRed2 = false;
                    }
                } else {
                    currentColor = Svetofor.YELLOW;
                    isFirstRed = true;
                    isFirstRed2 = true;
                }
            }

            if (currentColor.equals(Svetofor.YELLOW)) {
                if (isFirstYellow) {
                    yellowColorTime = startTime.plusSeconds(3);
                    isFirstYellow = false;
                }
                if (startTime.isBefore(yellowColorTime) && yellowColorTime != null) {
                    if (isFirstYellow2) {
                        System.out.println("WAIT");
                        isFirstYellow2 = false;
                    }
                } else {
                    currentColor = Svetofor.GREEN;
                    isFirstYellow = true;
                    isFirstYellow2 = true;
                }
            }

            if (currentColor.equals(Svetofor.GREEN)) {
                if (isFirstGreen) {
                    greenColorTime = startTime.plusSeconds(5);
                    isFirstGreen = false;
                }
                if (startTime.isBefore(greenColorTime) && greenColorTime != null) {
                    if (isFirstGreen2) {
                        System.out.println("GO");
                        isFirstGreen2 = false;
                    }
                } else {
                    currentColor = Svetofor.RED;
                    isFirstGreen = true;
                    isFirstGreen2 = true;
                }
            }

            LocalTime localTime = LocalTime.now();
            if (Duration.between(startTime, localTime).getSeconds() > 1) {
                System.out.println(startTime);
                startTime = startTime.plusSeconds(1);
            }
        }

    }
}
