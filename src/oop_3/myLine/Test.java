package oop_3.myLine;

public class Test {
    public static void main(String[] args) {
        MyLine myLine = new MyLine(2,5,8,4);
        myLine.setBeginXY(5,9);
        System.out.println(myLine.getBeginXY());
    }
}
