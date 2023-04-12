package JavaEssential.hw9.t5;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Васька", 5, false);
        System.out.println(animal1.toString() + " hashCode - " + animal1.hashCode());
        Animal animal2 = new Animal("Петька", 3, true);
        System.out.println(animal2.toString() + " hashCode - " + animal2.hashCode());
        Animal animal3 = new Animal("Васька", 5, false);
        System.out.println(animal3.toString() + " hashCode - " + animal3.hashCode());
        Animal animal4 = new Animal("Петька", 3, true);
        System.out.println(animal4.toString() + " hashCode - " + animal4.hashCode());
        System.out.println("animal1 == animal2 -" + animal1.equals(animal2));
        System.out.println("animal1 == animal3 -" + animal1.equals(animal3));
        System.out.println("animal2 == animal3 -" + animal2.equals(animal3));
        System.out.println("animal2 == animal4 -" + animal2.equals(animal4));

        animal2 = animal3;
        System.out.println(animal1.toString() + " hashCode - " + animal1.hashCode());
        System.out.println(animal2.toString() + " hashCode - " + animal2.hashCode());
        System.out.println(animal3.toString() + " hashCode - " + animal3.hashCode());
        System.out.println(animal4.toString() + " hashCode - " + animal4.hashCode());
        System.out.println("animal1 == animal2 -" + animal1.equals(animal2));
        System.out.println("animal1 == animal3 -" + animal1.equals(animal3));
        System.out.println("animal2 == animal3 -" + animal2.equals(animal3));
        System.out.println("animal2 == animal4 -" + animal2.equals(animal4));


    }


}
