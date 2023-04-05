package JavaEssential.hw6.t2;

public class Main {
    public static void main(String[] args) {
        Vehicle.Door door = new Vehicle.Door();
        Vehicle.Wheel wheel = new Vehicle.Wheel();
        door.print();
        wheel.print();
        Vehicle vechicle = new Vehicle();
        vechicle.print();
    }
}
