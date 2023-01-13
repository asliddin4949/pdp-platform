package Lesson1.Task4;

public enum Month implements FindSeason {
    JANUARY, FEBRUARY,
    MARCH, APRIL, MAY,
    JUNE, JULY, AUGUST,
    SEPTEMBER, OCTOBER, NOVEMBER,
    DECEMBER;

    @Override
    public Season findSeason() {
        Season season;
        switch (this) {

            case DECEMBER, JANUARY, FEBRUARY -> season = Season.WINTER;
            case MARCH, MAY, APRIL -> season = Season.SPRING;
            case JUNE, JULY, AUGUST -> season = Season.SUMMER;
            case SEPTEMBER, OCTOBER, NOVEMBER -> season = Season.AUTUMN;
            default -> season = null;

        }
        return season;
    }
}
