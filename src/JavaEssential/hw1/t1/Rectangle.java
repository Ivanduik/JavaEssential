package JavaEssential.hw1.t1;

public class Rectangle {
    private double side1, side2;

    public Rectangle() {

    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }


    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double areaCalculator() {
        return this.side1 * this.side2;

    }

    public double perimeterCalculator() {
        return this.side1 * 2 + this.side2 * 2;

    }

    public double areaCalculator(double side1, double side2) {
        return side1 * side2;

    }

    public double perimeterCalculator(double side1, double side2) {
        return side1 * 2 + side2 * 2;

    }
}
