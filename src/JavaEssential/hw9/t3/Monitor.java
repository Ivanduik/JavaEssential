package JavaEssential.hw9.t3;

public class Monitor extends Device {
    private String model;
    private int resolutionX = 0;
    private int resolutionY = 0;


    public Monitor(String manufacturer, float price, String serialNumber, String model, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.model = model;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor :"
                +" Manufactured - "+getManufacturer()
                +" Price - "+getPrice()
                +" SerialNumber - "+getSerialNumber()
                + ", X = " + getResolutionX()
                + ", Y = " + getResolutionY();
    }
}
