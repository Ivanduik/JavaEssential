package JavaEssential.hw6.t2;

public class Vehicle {
    public void print() {
        System.out.println("Vehicle");
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
        public boolean isOpen;

        public Door() {
            isOpen = false;
        }

        public Door(boolean open) {
            this.isOpen = open;
        }

        public void print() {
            System.out.println("Door - " + (isOpen ? "open" : "close"));
        }
    }
}
