import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AnimalHospital implements Serializable {
    private List<Animal> animals;

    public AnimalHospital() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says " + animal.makeSound());
        }
    }
}
