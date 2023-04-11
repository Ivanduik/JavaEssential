package JavaEssential.hw9.t3;

public class Main {
    public static void main(String[] args) {
        Device monitor = new Monitor(
                "Samsung",
                125.6f,
                "123456",
                "A27",
                1024,
                1800
        );


        Device ethernetAdapter = new EthernetAdapter(
                "Alink",
                25.3f,
                "1255ddz",
                "bd100",
                1000,
                "00:30:48:5a:58:65"
        );

        System.out.println(monitor.toString().hashCode());
    }
}
