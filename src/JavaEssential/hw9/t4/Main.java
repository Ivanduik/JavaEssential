package JavaEssential.hw9.t4;

public class Main {

    public static void main(String[] args) {
        Device device = new Device("Samsungg", 125.56f, "13131ddsfvdzcx");
        Device device2;
        Monitor monitor = new Monitor(
                "Samsung",
                125.6f,
                "123456",
                "C24F390FHI ",
                1920,
                1080
        );
        Monitor monitor2 = new Monitor(
                "Samsung",
                125.6f,
                "123456",
                "C24F390FHI ",
                1920,
                1080
        );
        // device = monitor;
        device2 = (Device) monitor;
        Device ethernetAdapter = new EthernetAdapter(
                "Alink",
                25.3f,
                "1255ddz",
                "bd100",
                1000,
                "00:30:48:5a:58:65"
        );
        System.out.println(device.toString());
        System.out.println("hashCode - device " + device.hashCode());

        System.out.println(device2.toString());
        System.out.println("hashCode - device2 " + device2.hashCode());
        System.out.println("monitor == device - " + monitor.equals(device));

        System.out.println(monitor.toString());
        System.out.println("hashCode - monitor " + monitor.hashCode());
        System.out.println("monitor == device2 - " + monitor.equals(device2));


        System.out.println(monitor.toString());
        System.out.println("hashCode - monitor " + monitor.hashCode());
        System.out.println(monitor2.toString());
        System.out.println("hashCode - monitor2 " + monitor2.hashCode());
        System.out.println("monitor == monitor2 -" + monitor.equals(monitor2));

        device2.setSerialNumber("sss");

        System.out.println(monitor.toString());
        System.out.println("hashCode - monitor " + monitor.hashCode());
        System.out.println(monitor2.toString());
        System.out.println("hashCode - monitor2 " + monitor2.hashCode());
        System.out.println("monitor == monitor2 -" + monitor.equals(monitor2));

    }
}
