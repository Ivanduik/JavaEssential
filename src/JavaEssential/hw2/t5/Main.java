package JavaEssential.hw2.t5;

import JavaEssential.general.General;

public class Main {
    public static void main(String[] args) {
      double r=0;
        System.out.println("Input radius of circle: ");
        r=General.inDouble();
        System.out.println("Arial of circle - "+MyArea.areaOfCircle(r));
        MyArea.setR(r);
        System.out.println("Arial of circle - "+MyArea.areaOfCircle());
    }
}
