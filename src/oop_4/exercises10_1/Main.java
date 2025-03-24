package oop_4.exercises10_1;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("Hozirgi vaqt: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

        Time time2 = new Time(555550000);
        System.out.println("555550000 ms -> " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());

        Time time3 = new Time(5, 23, 55);
        System.out.println("Berilgan vaqt: " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
    }
}
