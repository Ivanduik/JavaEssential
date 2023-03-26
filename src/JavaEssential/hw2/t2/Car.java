package JavaEssential.hw2.t2;

public class Car {
    private int year = 2015;
    private String color = "Red";

    public Car() {
        this.year = 2018;
        this.color = "Red";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public String toPrint() {
        return "\nCar year - " + this.year + "\nCar color - " + this.color + "\n";
    }
}
