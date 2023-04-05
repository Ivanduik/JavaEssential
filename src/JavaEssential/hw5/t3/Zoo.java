package JavaEssential.hw5.t3;

import java.util.ArrayList;
import java.util.List;

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

    public void delAnimal(int index) {
        if (index > animal.size()) {
            System.out.println("Index error");
            return;
        }
        System.out.println("Animal-" + animal.get(index).name + " remove");
        animal.remove(index);
    }

    public int sizeAnimal() {
        int size = animal.size();
        System.out.println("Size of zoo " + size + " animals");
        return size;
    }
}
