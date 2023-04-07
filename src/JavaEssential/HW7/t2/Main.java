package JavaEssential.HW7.t2;

public class Main {
    enum Animals {
        Bear("Be", 5), Elephant("Ele", 10), Giraffe("Gir", 7), Crocodile("Cro", 3), Fox("Xof", 1);
         int year;
        String name;

        Animals(String name, int year) {
            this.name = name;
            this.year = year;
        }

        public int getYear() {
            return year;
        }
        public  void setYear(int year){
            this.year=year;
        }
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return super.toString() + " " + name + " " + year;
        }
    }

    public static void main(String[] args) {
        Animals animal= Animals.Bear;
        animal.setYear(55);
        System.out.println(animal.toString());
        System.out.println("Name " + animal.getName());
        System.out.println("Year " + animal.getYear());
        animal= Animals.Fox;
        System.out.println(animal.toString());
        System.out.println("Name " + animal.getName());
        System.out.println("Year " + animal.getYear());
        animal= Animals.Giraffe;
        System.out.println(animal.toString());
        System.out.println("Name " + animal.getName());
        System.out.println("Year " + animal.getYear());

    }
}
