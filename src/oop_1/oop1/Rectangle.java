package oop_1.oop1;

class Rectangle {
    double width;
    double height;

    Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return 2*(this.width + this.height);
    }
}
