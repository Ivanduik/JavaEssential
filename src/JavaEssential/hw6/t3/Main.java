package JavaEssential.hw6.t3;

public class Main {
    public static void main(String[] args) {
        Distance distance = new Distance(100);
        distance.print();
        Distance conv;
        distance = new Distance(160000);
        conv = distance.conv().toMm();
        conv.print();
        conv = distance.conv().toKm();
        conv.print();
        conv = distance.conv().toInc();
        conv.print();
        conv = distance.conv().toMil();
        conv.print();


//        Distance.setDistanceInMeter(1000.0);
//        Distance.print();
//        System.out.println("Distance in mile - " + Distance.Converter.distanceInMil());
//        System.out.println("Distance in kilometre - " + Distance.Converter.distanceInKm());
//        System.out.println("Distance in millimeter - " + Distance.Converter.distanceInMl());
//        System.out.println("Distance in inches- " + Distance.Converter.distanceInInc());
//        System.out.println("----------------------------------------------------------");
//        Distance.setDistanceInKm(160);
//        Distance.print();
//        System.out.println("Distance in mile - " + Distance.Converter.distanceInMil());
//        System.out.println("Distance in kilometre - " + Distance.Converter.distanceInKm());
//        System.out.println("Distance in millimeter - " + Distance.Converter.distanceInMl());
//        System.out.println("Distance in inches- " + Distance.Converter.distanceInInc());
//        System.out.println("-----------------------------------------------------------");
//        Distance.setDistanceInMil(100);
//        Distance.print();
//        System.out.println("Distance in mile - " + Distance.Converter.distanceInMil());
//        System.out.println("Distance in kilometre - " + Distance.Converter.distanceInKm());
//        System.out.println("Distance in millimeter - " + Distance.Converter.distanceInMl());
//        System.out.println("Distance in inches- " + Distance.Converter.distanceInInc());
    }
}
