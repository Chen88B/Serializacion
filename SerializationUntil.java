import java.io.*;

public class SerializationUntil {
    public static void serialize(Object object, String fileName) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(object);
        }
    }

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return in.readObject();
        }
    }
}
