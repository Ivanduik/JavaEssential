package JavaEssential.hw1.t1;

import JavaEssential.general.General;

public class Main {
    static public void main(String[] arg) {
        // Rectangle rect = new Rectangle();
        double a, b;
        System.out.print("Input side rectangle A B\n ");
        System.out.print("Input side A\n");
        a = Rectangle.side1 = General.inDouble();
        System.out.print("Input side A\n");
        b = Rectangle.side2 = General.inDouble();
        System.out.printf("Area rectangle = %f without parameters \n", Rectangle.areaCalculator());
        System.out.printf("Area rectangle = %f with parameters \n", Rectangle.areaCalculator(a, b));
        System.out.printf("Perimeter rectangle = %f without parameters\n", Rectangle.perimeterCalculator());
        System.out.printf("Perimeter rectangle = %f with parameters\n", Rectangle.perimeterCalculator(a, b));
    }
}
