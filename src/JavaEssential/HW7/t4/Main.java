package JavaEssential.HW7.t4;

public class Main {
    public static void main(String[] args) {
        Vehicles car =Vehicles.car2;
        System.out.println(car.toString());
        System.out.println("Cost - "+car.getPrice());
        System.out.println("Color - "+car.getPrice());
        car =Vehicles.car1;
        System.out.println(car.toString());
        System.out.println("Cost - "+car.getPrice());
        System.out.println("Color - "+car.getColor());
        car =Vehicles.car3;
        System.out.println(car.toString());
        System.out.println("Cost - "+car.getPrice());
        System.out.println("Color - "+car.getColor());
    }
}
