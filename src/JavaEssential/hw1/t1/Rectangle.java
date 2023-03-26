package JavaEssential.hw1.t1;

public class Rectangle {
    static double side1, side2;

    public Rectangle() {
        Rectangle.side1 = 0;
        Rectangle.side2 = 0;
    }

    public Rectangle(double side1, double side2) {
        Rectangle.side1 = side1;
        Rectangle.side2 = side2;
    }

    public static double areaCalculator() {
        return Rectangle.areaCalculator(Rectangle.side1, Rectangle.side2);

    }

    public static double perimeterCalculator() {
        return Rectangle.perimeterCalculator(Rectangle.side1, Rectangle.side1);

    }

    public static double areaCalculator(double side1, double side2) {
        Rectangle.side1 = side1;
        Rectangle.side2 = side2;
        return Rectangle.side1 * Rectangle.side2;

    }

    public static double perimeterCalculator(double side1, double side2) {
        Rectangle.side1 = side1;
        Rectangle.side2 = side2;
        return Rectangle.side1 * 2 + Rectangle.side2 * 2;

    }
}
