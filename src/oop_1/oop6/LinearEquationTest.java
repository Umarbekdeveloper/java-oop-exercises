package oop_1.oop6;

public class LinearEquationTest {
    public static void main(String[] args) {
        LinearEquation linear = new LinearEquation(6,2,3,4,5,6);
        linear.isSolvable();
        System.out.println("x = "+linear.getX());
        System.out.println("y = "+linear.getY());
    }
}
