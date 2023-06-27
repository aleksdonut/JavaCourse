package rekurencja;

import java.io.File;

public class DirectoryLister {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\aleks\\Desktop");
        showDirectories(file);
    }

    private static void showDirectories(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("Folder: " + f.getAbsolutePath());
                    showDirectories(f);
                } else {
                    System.out.println(" Plik: " + f.getAbsolutePath());
                }
            }
        }
    }
}
