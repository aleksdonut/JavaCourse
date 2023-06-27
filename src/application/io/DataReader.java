package application.io;

import application.model.Book;
import application.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public Book readAndCreateBook() {
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Enter ISBN number: ");
        String isbn = scanner.nextLine();
        System.out.println("Enter release year: ");
        int releaseYear = scanner.nextInt();
        System.out.println("Enter number of pages: ");
        int pages = scanner.nextInt();
        return new Book(title, author, releaseYear, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Enter language: ");
        String language = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = getInt();
        System.out.println("Enter month: ");
        int month = getInt();
        System.out.println("Enter day: ");
        int day = getInt();
        return new Magazine(title, publisher, language, year, month, day);
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public void close(){
        scanner.close();
    }

}
