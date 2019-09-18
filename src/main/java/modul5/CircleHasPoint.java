package modul5;

import java.sql.SQLOutput;

public class CircleHasPoint {
    private Point point;
    private double radius;

    public CircleHasPoint(double x, double y, double radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return point.getX();
    }

    public double getY() {
        return point.getY();
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "M(" + getX() + "|" + getY() + "), r = " + getRadius();
    }
}
