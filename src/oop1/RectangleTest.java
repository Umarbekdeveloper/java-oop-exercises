package oop1;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Area:>>> " + rectangle1.getArea());
        System.out.println("Perimeter:>>> " + rectangle1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area:>>> " + rectangle2.getArea());
        System.out.println("Perimeter:>>> " + rectangle2.getArea());
    }
}
