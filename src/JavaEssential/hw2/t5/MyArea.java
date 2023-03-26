package JavaEssential.hw2.t5;

public class MyArea {
    private static final double PI = 3.14;
    private static double r = 0;

    public static void setR(double r) {
        MyArea.r = r;
    }

    public static double areaOfCircle() {
        if(r>=0)
        return MyArea.PI * MyArea.r * MyArea.r;
        System.out.println("Erorr radius <= 0");
        return 0;
    }

    public static double areaOfCircle(double r) {
        if(r>=0)
        return MyArea.PI * r * r;
        System.out.println("Erorr radius <= 0");
        return 0;
    }
}
