package JavaEssential.hw9.t4;

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
                + " Manufactured - " + getManufacturer()
                + " Price - " + getPrice()
                + " SerialNumber - " + getSerialNumber()
                + ", X = " + getResolutionX()
                + ", Y = " + getResolutionY();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Monitor monitor = (Monitor) obj;
        if (resolutionX != monitor.resolutionX) return false;
        if (resolutionY != monitor.resolutionY) return false;
        return model.equals(monitor.model);
    }

    //    A for nearly all cases reasonable good implementation
//    was proposed in Josh Bloch's Effective Java in Item 8 (second edition).
//    The best thing is to look it up there because the author explains there why the approach is good.
//
//    A short version
//    Create a int result and assign a non-zero value.
//
//    For every field f tested in the equals() method, calculate a hash code c by:
//
//    If the field f is a boolean: calculate (f ? 0 : 1);
//    If the field f is a byte, char, short or int: calculate (int)f;
//    If the field f is a long: calculate (int)(f ^ (f >>> 32));
//    If the field f is a float: calculate Float.floatToIntBits(f);
//    If the field f is a double: calculate Double.doubleToLongBits(f)
//    and handle the return value like every long value;
//    If the field f is an object: Use the result of the hashCode() method or 0 if f == null;
//    If the field f is an array: see every field as separate element
//    and calculate the hash value in a recursive fashion and combine the values as described next.
//    Combine the hash value c with result:
//
//    result = 37 * result + c
//    Return result
//
//    This should result in a proper distribution of hash values for most use situations.
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 37 * result + (model != null ? (model.hashCode()) : 0);
        result = 37 * result + (int) ((long) resolutionX ^ ((long) resolutionX >>> 32));
        result = 37 * result + (int) ((long) resolutionY ^ ((long) resolutionY >>> 32));
        return result;
    }
}
