package operacje.na.plikach;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testFile.txt";

        try (
                var fileWriter = new FileWriter(fileName, true);
                var bufferedWriter = new BufferedWriter(fileWriter);
             )
        {
            bufferedWriter.write("Kasia");
            bufferedWriter.newLine();
            bufferedWriter.write("Basia");
            bufferedWriter.newLine();
            bufferedWriter.write("Asia");
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
