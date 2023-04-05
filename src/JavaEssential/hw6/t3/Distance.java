package JavaEssential.hw6.t3;

public class Distance {
    private static double distance = 0;

    public static void setDistanceInMeter(double dist) {
        distance = dist;
    }

    public static void setDistanceInKm(double dist) {
        distance = dist * 1000;
    }

    public static void setDistanceInMil(double dist) {
        distance = dist / 0.000621371;
    }

    public static void print() {
        System.out.println("Distance in meter - " + distance);
    }

    static class Converter {


        public static double distanceInKm() {
            return Distance.distance / 1000;
        }

        public static double distanceInMl() {
            return Distance.distance * 1000;
        }

        public static double distanceInInc() {
            return Distance.distance * 39.3700787;
        }

        public static double distanceInMil() {
            return Distance.distance * 0.000621371;
        }
    }

}
