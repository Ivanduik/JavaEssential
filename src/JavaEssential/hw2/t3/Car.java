package JavaEssential.hw2.t3;
public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 2015;
        this.speed = 120;
        this.weight = 1060;
        this.color = "Green";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 120;
        this.weight = 1060;
        this.color = "Green";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1060;
        this.color = "Green";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Green";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public String toPrint() {
        return
                "\nYear - " + this.year +
                        "\nSpeed - " + this.speed +
                        "\nWeight - " + this.weight +
                        "\nColor - " + this.color + "\n";
    }
}
