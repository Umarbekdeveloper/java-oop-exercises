package oop_4.exercises10_4;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0,0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point){
        return Math.hypot(this.x - point.getX(), this.y - point.getY());
    }

    public double distance(double x, double y){
        return Math.hypot(this.x - x, this.y - y);
    }
}
