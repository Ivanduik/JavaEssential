package JavaEssential.hw6.t3;

public class Main {
    public static void main(String[] args) {
        Distance.setDistanceInMeter(1000.0);
        Distance.print();
        System.out.println("Distance in mile - " + Distance.Converter.distanceInMil());
        System.out.println("Distance in kilometre - " + Distance.Converter.distanceInKm());
        System.out.println("Distance in millimeter - " + Distance.Converter.distanceInMl());
        System.out.println("Distance in inches- " + Distance.Converter.distanceInInc());
        System.out.println("----------------------------------------------------------");
        Distance.setDistanceInKm(160);
        Distance.print();
        System.out.println("Distance in mile - " + Distance.Converter.distanceInMil());
        System.out.println("Distance in kilometre - " + Distance.Converter.distanceInKm());
        System.out.println("Distance in millimeter - " + Distance.Converter.distanceInMl());
        System.out.println("Distance in inches- " + Distance.Converter.distanceInInc());
        System.out.println("-----------------------------------------------------------");
        Distance.setDistanceInMil(100);
        Distance.print();
        System.out.println("Distance in mile - " + Distance.Converter.distanceInMil());
        System.out.println("Distance in kilometre - " + Distance.Converter.distanceInKm());
        System.out.println("Distance in millimeter - " + Distance.Converter.distanceInMl());
        System.out.println("Distance in inches- " + Distance.Converter.distanceInInc());
    }
}
