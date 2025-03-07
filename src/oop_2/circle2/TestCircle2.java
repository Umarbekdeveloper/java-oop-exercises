package oop_2.circle2;

public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(1.1);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

        Circle2 c2 = new Circle2();
        System.out.println(c2);
        System.out.println("radius is: " + c2.getRadius());
        System.out.printf("area is: %.2f%n", c2.getArea());
        System.out.printf("circumference is: %.2f%n", c2.getCircumference());

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
