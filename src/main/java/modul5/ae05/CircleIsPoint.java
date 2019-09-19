package modul5.ae05;

public class CircleIsPoint extends Point {
    private double radius;

    public CircleIsPoint(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "M(" + getX() + "|" + getY() + "), r = " + getRadius();
    }
}
