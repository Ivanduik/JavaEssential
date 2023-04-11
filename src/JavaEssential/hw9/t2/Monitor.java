package JavaEssential.hw9.t2;

public class Monitor extends Device{
    private String name;
    private int resolutionX = 0;
    private int resolutionY = 0;


    public Monitor(String manufacturer, float price, String serialNumber,String name,int resolutionX,int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.name=name;
        this.resolutionX=resolutionX;
        this.resolutionY=resolutionY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
