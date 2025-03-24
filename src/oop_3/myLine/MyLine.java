package oop_3.myLine;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return getBeginX();
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }

    public int getBeginY(){
        return getBeginY();
    }

    public void setBeginY(int y){
        this.begin.setX(y);
    }

    public int getEndX(){
        return getEndX();
    }

    public void setEndX(int x){
        this.end.setX(x);
    }

    public int getEndY(){
        return getEndX();
    }

    public void setEndY(int y){
        this.end.setX(y);
    }

    public  int[] getBeginXY(){
        return new int[] {begin.getX(),begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }


    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        int x1 = begin.getX();
        int y1 = begin.getY();
        int x2 = end.getX();
        int y2 = end.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double getGradient() {
        int x1 = begin.getX();
        int y1 = begin.getY();
        int x2 = end.getX();
        int y2 = end.getY();

        int yDiff = y2 - y1;
        int xDiff = x2 - x1;

        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }


}
