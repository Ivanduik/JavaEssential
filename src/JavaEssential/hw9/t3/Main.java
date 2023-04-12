package JavaEssential.hw9.t3;

public class Main {

    public static void main(String[] args) {
        Device device = new Device("Samsung", 125.56f, "13131ddsfvdzcx");

        Monitor monitor = new Monitor(
                "Samsung",
                125.6f,
                "123456",
                "C24F390FHI ",
                1920,
                1080
        );
        Device ethernetAdapter = new EthernetAdapter(
                "Alink",
                25.3f,
                "1255ddz",
                "bd100",
                1000,
                "00:30:48:5a:58:65"
        );
        System.out.println(device.toString());
        System.out.println(monitor.toString());
        System.out.println(ethernetAdapter.toString());
    }
}
