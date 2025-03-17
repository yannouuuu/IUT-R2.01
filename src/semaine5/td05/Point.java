package semaine5.td05;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
