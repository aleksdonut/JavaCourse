package application.app;

public class LibraryApp {
    private static final String APP_NAME = "Library v1.3";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
