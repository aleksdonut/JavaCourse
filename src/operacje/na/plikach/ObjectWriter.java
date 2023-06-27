package operacje.na.plikach;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person person1 = new Person("Jan", "Kowalski");

        try (
                var fileOutputStream = new FileOutputStream(fileName);
                var objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ) {
            objectOutputStream.writeObject(person1);
            System.out.println("Object saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
