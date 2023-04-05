package JavaEssential.hw6.t2;

import java.util.ArrayList;
import java.util.List;

public class Vechicle {
    Wheel wheel;
    Door door;

    public Vechicle() {
        wheel = new Wheel();
        door = new Door();
    }

    public Vechicle(int radius, boolean open) {
        wheel = new Wheel(radius);
        door = new Door(open);
    }

    public void print() {
        System.out.println("Vehicle");
        door.print();
        wheel.print();
    }

    public static class Wheel {
        private int radiusInch;

        public Wheel() {
            radiusInch = 15;
        }

        public Wheel(int radiusInch) {
            this.radiusInch = radiusInch;
        }

        void print() {
            System.out.println("Wheel radius - " + radiusInch);
        }
    }

    public static class Door {
        public boolean open;

        public Door() {
            open = false;
        }

        public Door(boolean open) {
            this.open = open;
        }

        public void print() {
            System.out.println("Door - " + (open ? "open" : "close"));
        }
    }
}
