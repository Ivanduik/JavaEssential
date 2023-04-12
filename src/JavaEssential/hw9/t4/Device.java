package JavaEssential.hw9.t4;

import java.util.Objects;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device() {

    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device:" +
                " Manufacturer - " + getManufacturer()
                + ", price - " + getPrice()
                + ", serialNumber = " + getSerialNumber();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;
        return serialNumber.equals(device.serialNumber);
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
        int result=17;
        result = 37 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}
