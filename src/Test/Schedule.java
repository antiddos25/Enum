package Test;

public class Schedule {
    private Day days;
    private String subjects;

    public Schedule(Day days, String subjects) {
        this.days = days;
        this.subjects = subjects;
    }

    public Day getDays() {
        return days;
    }

    public void setDays(Day days) {
        this.days = days;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "days=" + days +
                ", subjects='" + subjects + '\'' +
                '}';
    }
}
