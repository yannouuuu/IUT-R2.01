package td5.ex2;

public class ExtendedCircle extends Point {
    private double radius;
    public ExtendedCircle(double x, double y, double r) {
        super(x, y);
        this.radius = r;
    }

    public void updateRadius(double r) {
        this.radius = r;
    }

    public Point getCenter() {
        return this;
    }

    public String toString() {
        return "EncapsulatedCircle[" + super.toString + ", " + this.radius + "]";
    }
}
