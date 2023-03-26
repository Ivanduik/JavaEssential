package JavaEssential.hw1.t4;

public class Post {
    static public void main(String[] arg) {
        Address adr = new Address(25006, "Ukraine", "Kropyvnytskyi", "Vokzalna", "26k2", "85");
        Address adr1 = new Address();
        adr1.index = 25013;
        adr1.country = "Ukraine";
        adr1.city = "Kropyvnytskyi";
        adr1.street = "Andriivska";
        adr1.house = "16";
        adr1.apartment = "96";
        System.out.println(adr.toPrint());
        System.out.println(adr1.toPrint());

    }
}
