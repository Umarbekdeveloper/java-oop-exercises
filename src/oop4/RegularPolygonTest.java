package oop4;

public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon2 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("Perimetri = "+regularPolygon1.getPerimeter()+" | Area = "+regularPolygon1.getArea());
        System.out.println("Perimeter = "+regularPolygon2.getPerimeter()+" | Area = "+regularPolygon2.getArea());

    }
}
