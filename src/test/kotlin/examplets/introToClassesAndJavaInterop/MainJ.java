package examplets.introToClassesAndJavaInterop;

public class MainJ {

    public static void main(String[] args) {

        Point p1 = new Point(3, 3);
        PointJ p2 = new PointJ(4, 4);

        System.err.println(p1.getX());
        System.err.println(p1.getY());

        System.err.println(p2.getX());
        System.err.println(p2.getY());

    }
}
