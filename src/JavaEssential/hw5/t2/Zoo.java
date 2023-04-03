package JavaEssential.hw5.t2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Zoo {
    private ArrayList<Animal> animal;

    public Zoo() {
        animal = new ArrayList<>();
    }

    public Zoo(int size) {
        animal = new ArrayList<>(size);
    }

    public void addAnimal(int index, Animal animal) {
        this.animal.add(index, animal);
    }

    public void printAllAnimal() {
        System.out.println("All animals of Zoo");
        for (Animal animal : animal) {
            System.out.println(animal.name);
        }

    }
}
