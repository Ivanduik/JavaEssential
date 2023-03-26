package JavaEssential.hw2.t4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 2012;
        this.speed = 140;
        this.weight =1268;
        this.color = "Red";
    }

    public Car(int year) {
        this();
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year,speed,weight);
        this.color=color;
    }
    public String toPrint() {
        return
                "\nYear - " + this.year +
                        "\nSpeed - " + this.speed +
                        "\nWeight - " + this.weight +
                        "\nColor - " + this.color + "\n";
    }
}
