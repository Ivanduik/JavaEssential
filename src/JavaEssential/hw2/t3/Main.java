package JavaEssential.hw2.t3;

import JavaEssential.hw2.t3.Car;


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(2018);
        Car car2 = new Car(2019, 125);
        Car car3 = new Car(2020, 130, 1200);
        Car car4 = new Car(2022, 112, 1500, "Black");
        System.out.print("car= new Car();");
        System.out.print(car.toPrint());
        System.out.print("car1= new Car(2018);");
        System.out.print(car1.toPrint());
        System.out.print("car2= new Car(2019,125);");
        System.out.print(car2.toPrint());
        System.out.print("car3 =new Car(2020,130,1200);");
        System.out.print(car3.toPrint());
        System.out.print("car4 = new Car(2022, 112, 1500, \"Black\"");
        System.out.print(car4.toPrint());
    }


}
