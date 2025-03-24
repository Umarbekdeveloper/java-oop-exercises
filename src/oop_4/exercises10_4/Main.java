package oop_4.exercises10_4;

public class Main {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(3,4);
        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint2.distance(3,4));

    }
}
