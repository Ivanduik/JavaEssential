package JavaEssential.hw3.t3;

public class Plane extends Vehicle {

    public int height;
    public int numberOfPassengers;

    public Plane(float price, int speed, int year, int height, int numberOfPassengers) {
        super(price, speed, year);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "\nPrice - " + this.price + "\nSpeed - " + this.speed +
                "\nYear - " + this.year + "\nHeight - " + this.height + "\nNumber of passengers - " + this.numberOfPassengers;
    }
}
