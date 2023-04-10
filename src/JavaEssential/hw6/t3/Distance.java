package JavaEssential.hw6.t3;

public class Distance {
    private double distance = 0;
    private double distanceInM = 0;
    private String numStr = "Distance in meter - ";

    public Distance(double distance) {
        this.distance = distance;
        distanceInM = distance;
    }

    public Distance(double distanceInM, double distance, String numStr) {
        this.distance = distance;
        this.distanceInM = distanceInM;
        this.numStr = numStr;
    }

    public void print() {
        System.out.println(numStr + distance);
    }

    public Converter conv() {
        return new Converter(distanceInM, distance, numStr);
    }


    public class Converter {
        private double distance = 0;
        private String numStr;
        private double distanceInM = 0;

        public Converter(double distanceInM, double distance, String numStr) {
            this.distance = distance;
            this.numStr = numStr;
            this.distanceInM = distanceInM;
        }

        public Distance toKm() {
            numStr = "Distance in kilometer - ";
            return new Distance(distanceInM, distanceInM / 1000, numStr);
        }

        public Distance toMm() {
            numStr = "Distance in mm - ";
            return new Distance(distanceInM, distanceInM * 1000, numStr);
        }

        public Distance toInc() {
            numStr = "Distance in inch - ";
            return new Distance(distanceInM, distanceInM * 39.3700787, numStr);
        }

        public Distance toMil() {
            numStr = "Distance in mile - ";
            return new Distance(distanceInM, distanceInM * 0.000621371, numStr);
        }
    }

}
