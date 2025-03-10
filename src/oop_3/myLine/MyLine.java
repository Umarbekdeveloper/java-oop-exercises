package oop_3.myLine;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1,int y1, int x2, int y2) {
        x1=x1;
        y1=y1;
        x2=x2;
        y2=y2;
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
        return x;
    }
}
