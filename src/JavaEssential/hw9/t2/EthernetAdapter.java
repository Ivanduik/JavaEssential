package JavaEssential.hw9.t2;

public class EthernetAdapter extends Device {
    private String model;
    private int speed;
    private String mac;


    public EthernetAdapter(String manufacturer,
                           float price,
                           String serialNumber,
                           String model, int speed,
                           String mac) {
        super(manufacturer, price, serialNumber);
        this.model = model;
        this.speed = speed;
        this.mac = mac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
