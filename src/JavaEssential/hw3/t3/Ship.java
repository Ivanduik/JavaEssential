package JavaEssential.hw3.t3;

public class Ship extends Vehicle {
    public int numberOfPassengers;
    public String port;

    public Ship(float price, int speed, int year, String port, int numberOfPassengers) {
        super(price, speed, year);
        this.port = port;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String toString() {
        return "\nPrice - " + this.price + "\nSpeed - " + this.speed +
                "\nYear - " + this.year + "\nPort - " + this.port +
                "\nNumber of passengers - " + this.numberOfPassengers;
    }
}
