package Test;

public class Test {

    public static void main(String[] args) {
        Schedule schedule = new Schedule(Day.Monday, "Math, Phys, Chem");
        Schedule schedule1 = new Schedule(Day.Monday, "Liter, Hist, Geog");
        Schedule schedule2 = new Schedule(Day.Monday, "Math, Phys, Chem");
        Schedule schedule3 = new Schedule(Day.Monday, "Phys, Chem, Biolo");
        Schedule schedule4 = new Schedule(Day.Monday, "IT, Liter, Chem");

        System.out.println(schedule4);
    }
}
