package oop_1.oop6;

public class LinearEquation {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    void isSolvable() {
        if (a*d-b*c>0){
            System.out.println("Yechim: "+(a*d-b*c));
        }else {
            System.out.println("The equation has no solution");
        }
    }

    double getX(){
        return (e*d - f*b)/(a*d-b*c);
    }

    double getY(){
        return (a*f - e*c)/(a*d-b*c);
    }
}
