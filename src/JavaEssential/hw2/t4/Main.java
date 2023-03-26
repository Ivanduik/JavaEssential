package JavaEssential.hw2.t4;

import JavaEssential.hw2.t4.Car;

public class Main {
    public static void main(String[] args) {


    Car car = new Car();
    Car car1 = new Car(2019);
    Car car2 = new Car(2018, 105);
    Car car3 = new Car(2022, 130, 2000);
    Car car4 = new Car(2021, 122, 1505, "Black");
        System.out.print("car= new Car();");
        System.out.print(car.toPrint());
        System.out.print("car1= new Car(2019);");
        System.out.print(car1.toPrint());
        System.out.print("car2 = new Car(2018, 105);");
        System.out.print(car2.toPrint());
        System.out.print("car3 = new Car(2022, 130, 2000);");
        System.out.print(car3.toPrint());
        System.out.print("car4 = new Car(2021, 122, 1505, \"Black\");");
        System.out.print(car4.toPrint());

}
}