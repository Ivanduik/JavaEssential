package JavaEssential.hw9.t2;

public class EthernetAdapter extends Device {
    private String name;
    private int speed;
    private String mac;


    public EthernetAdapter(String manufacturer,
                           float price,
                           String serialNumber,
                           String name, int speed,
                           String mac) {
        super(manufacturer, price, serialNumber);
        this.name = name;
        this.speed = speed;
        this.mac = mac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
