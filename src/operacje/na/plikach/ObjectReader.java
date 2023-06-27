package operacje.na.plikach;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person person1 = null;

        try (
                var fileInputStream = new FileInputStream(fileName);
                var objectInputStream = new ObjectInputStream(fileInputStream);
            ) {
            person1 = (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (person1 != null) {
            System.out.println(person1.getFirstName() + " " + person1.getLastName());
        }
    }
}
