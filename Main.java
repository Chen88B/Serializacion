import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Crear un hospital de animales y agregar animales
        AnimalHospital hospital = new AnimalHospital();
        hospital.addAnimal(new Cat("Whiskers"));
        hospital.addAnimal(new Dog("Rover"));

        // Serializar el hospital
        try {
            SerializationUntil.serialize(hospital, "animalHospital.ser");
            System.out.println("Hospital serialized to animalHospital.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializar el hospital
        try {
            AnimalHospital deserializedHospital = (AnimalHospital) SerializationUntil.deserialize("animalHospital.ser");
            System.out.println("Hospital deserialized from animalHospital.ser");
            deserializedHospital.printAnimals();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
