package Lesson1.Task5;

public enum WeekDays implements UzRuEn {

    MONDAY("Dushanba", "Понеделник", "Monday"),
    TUESDAY("Seshanba", "Вторник", "Tuesday"),
    WEDNESDAY("Chorshanba", "Среда", "Wednesday"),
    THURSDAY("Payshanba", "Четверг", "Thursday"),
    FRIDAY("Juma", "Пятница", "Friday"),
    SATURDAY("Shanba", "Суббота", "Saturday"),
    SUNDAY("Yakshanba", "Воскреснъе", "Sunday");
    private String uzb;
    private String ru;
    private String en;

    WeekDays(String uzb, String ru, String en) {
        this.uzb = uzb;
        this.ru = ru;
        this.en = en;
    }

    @Override
    public void nameRu() {
        System.out.println(this.ru);
    }

    @Override
    public void nameUz() {
        System.out.println(this.uzb);
    }

    @Override
    public void nameEn() {
        System.out.println(this.en);
    }
}
