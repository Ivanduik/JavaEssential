package JavaEssential.hw3.t3;

public class Car extends Vehicle {
    public Car(float price, int speed, int year) {
        super(price, speed, year);
    }

    @Override
    public String toString() {
        return "\nPrice - " + this.price + "\nSpeed - " + this.speed +
                "\nYear - " + this.year;
    }
}
