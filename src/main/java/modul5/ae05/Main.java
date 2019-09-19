package modul5.ae05;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        point.print();

        CircleIsPoint circleIsPoint = new CircleIsPoint(1, 2, 3);
        circleIsPoint.print();

        CircleHasPoint circleHasPoint = new CircleHasPoint(1, 2, 3);
        circleHasPoint.print();
    }
}
