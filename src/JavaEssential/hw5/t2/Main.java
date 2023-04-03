package JavaEssential.hw5.t2;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(8);
        Animal animal = new Animal("Bear");
        zoo.addAnimal(0, animal);

        animal = new Animal("Elephant");
        zoo.addAnimal(1, animal);

        animal = new Animal("Giraffe");
        zoo.addAnimal(2, animal);

        animal = new Animal("Crocodile");
        zoo.addAnimal(3, animal);

        animal = new Animal("Fox");
        zoo.addAnimal(4, animal);

        animal = new Animal("Hare");
        zoo.addAnimal(5, animal);

        animal = new Animal("Wolf");
        zoo.addAnimal(6, animal);

        animal = new Animal("Lion");
        zoo.addAnimal(7, animal);
        zoo.printAllAnimal();


    }
}
