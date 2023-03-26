package JavaEssential.hw2.t2;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Car(2018);
        Car car2=new Car("White");
        Car car3=new Car(2019,"Blue");

        System.out.print("car=new Car();");
        System.out.print(car.toPrint());

        System.out.print("car1=new Car(2018);");
        System.out.print(car1.toPrint());

        System.out.print("car2=new Car(\"White\");");
        System.out.print(car2.toPrint());

        System.out.print("car3=new Car(2019,\"Blue\");");
        System.out.print(car3.toPrint());
    }
}
