package operacje.na.plikach;

import java.io.*;
import java.util.Scanner;

public class FileCreator {
    public static void main(String[] args) {
        String fileName = "testfile.txt";

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader);
             )
        {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = bufferedReader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
                System.out.println(lines);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
