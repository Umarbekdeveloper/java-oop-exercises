package oop_1.oop5;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    double getDiscriminant() {
        return b*b-4*a*c;
    }

    void getRoot12(){
        double discriminant = getDiscriminant();
        if (discriminant < 0){
            System.out.println("The equation has no roots!!");
        }
        if (discriminant == 0){
            System.out.println("Yechim: "+ getRoot1());
        }else {
            System.out.println("Yechim: "+ getRoot1());
            System.out.println("Yechim: "+ getRoot2());
        }
    }
    double getRoot1 (){
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    double getRoot2 (){
        return (-b-Math.sqrt(b*b-4*a*c))/2*a;
    }
}
