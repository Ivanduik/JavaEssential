package JavaEssential.HW7.t4;

public enum Vehicles {
    car1(1000) {
        {
            this.color = "Red";
        }
    }, car2(20000) {
        {
            this.color = "White";
        }
    }, car3(18000) {
        {
            this.color = "Blue";
        }
    };
    int price;
    String color;

    Vehicles(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car - " + super.toString() + "  cost - " + price + "  color -"+color;
    }
}
