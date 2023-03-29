package JavaEssential.hw3.t3;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(2100, 210, 2011);
        Vehicle ship = new Ship(120.2f, 35, 2020, "Odessa", 25);
        Vehicle plane = new Plane(12000.2f, 600, 2022, 5000, 50);
        System.out.println("Plane" + plane.toString());
        System.out.println("Ship" + ship.toString());
        System.out.println("Car" + car.toString());
    }
}
