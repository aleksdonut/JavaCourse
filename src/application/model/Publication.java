package application.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Publication implements Serializable {
    private int year;
    private String title;
    private String publisher;

    Publication(int year, String title, String publisher) {
        this.year = year;
        this.title = title;
        this.publisher = publisher;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getPublisher() {
        return publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication that)) return false;
        return year == that.year && Objects.equals(title, that.title) && Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, title, publisher);
    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + year;
    }

    public abstract String toCsv();
}
