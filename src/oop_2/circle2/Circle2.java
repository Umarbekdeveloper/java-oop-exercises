package oop_2.circle2;

public class Circle2 {
    double radius;

    Circle2(){
        radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
     public double getArea() {
        return Math.PI*radius*radius;
     }

     public double getCircumference() {
        return 2*Math.PI*radius;
     }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
