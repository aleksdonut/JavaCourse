package application.model;

import java.io.Serial;
import java.io.Serializable;

public class Library implements Serializable {
    private static final int MAX_PUBLICATIONS = 1000;
    private int publicationsNumber;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumber];
        for (int i = 0; i < publicationsNumber; i++) {
            result[i] = publications[i];
        }
        return result;
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    public void addPublication(Publication publication) {
        if (publicationsNumber >= MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded " + MAX_PUBLICATIONS);
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }
}
