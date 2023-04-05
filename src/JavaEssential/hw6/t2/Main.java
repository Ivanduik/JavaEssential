package JavaEssential.hw6.t2;

public class Main {
    public static void main(String[] args) {
        Vechicle.Door door = new Vechicle.Door();
        Vechicle.Wheel wheel = new Vechicle.Wheel();
        door.print();
        wheel.print();
        Vechicle vechicle = new Vechicle();
        vechicle.print();
        Vechicle vechicle1 = new Vechicle(20, true);
        vechicle1.print();
    }
}
