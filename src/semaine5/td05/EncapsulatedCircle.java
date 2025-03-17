package semaine5.td05;

public class EncapsulatedCircle extends Point {
    private Point center;
    private double radius;

    public EncapsulatedCircle(double x, double y, double r) {
        this.center = new Point(x, y);
        this.radius = r;
    }

    public void moveCenter(double dx, double dy) {
        center.move(dx, dy);
    }

    public void updateRadius(double r) {
        this.radius = r;
    }
    public Point getCenter(){
        return this.center;
    }

    public String toString(){
        return "EncapsulatedCircle[" + this.center + ", " + this.radius + "]";
    }
}
