package JavaEssential.hw1.t1;

import JavaEssential.general.General;

public class Main {
    static public void main(String[] arg) {
        double a, b;
        Rectangle rect = new Rectangle();

        System.out.print("Input side rectangle A B\n ");
        System.out.print("Input side A\n");
        a = General.inDouble();
        System.out.print("Input side A\n");
        b = General.inDouble();
        rect.setSide1(a);
        rect.setSide2(b);
        System.out.printf("Area rectangle = %f setter\n", rect.areaCalculator());
        System.out.printf("Area rectangle = %f method\n", rect.areaCalculator(a, b));
        System.out.printf("Perimeter rectangle = %f setter\n", rect.perimeterCalculator());
        System.out.printf("Perimeter rectangle = %f method\n", rect.perimeterCalculator(a, b));
    }
}
