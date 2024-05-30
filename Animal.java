import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}

