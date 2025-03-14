package oop_3.myPoint;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
        x=0;
        y=0;
    }

    public MyPoint(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{this.x,this.y};
    }

    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y +')';
    }

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }


}
