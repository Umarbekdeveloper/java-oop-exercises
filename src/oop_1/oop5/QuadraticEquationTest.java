package oop_1.oop5;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a= ");
        double a = scanner.nextDouble();
        System.out.print("b= ");
        double b = scanner.nextDouble();
        System.out.print("c= ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        equation.getRoot12();
        System.out.println("The discriminant of  the equation is >>> "+equation.getDiscriminant());
        System.out.println("The equation is >>> "+equation.getRoot1());
        System.out.println("The equation is >>> "+equation.getRoot2());
    }
}
