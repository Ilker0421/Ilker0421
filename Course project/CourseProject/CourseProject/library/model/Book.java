package library.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1);

    private final int isbn;
    private String title;
    private String author;
    private Genre genre;
    private String[] tags;

    public Book(String title, String author, String tags) {
        this.isbn = ID_GENERATOR.getAndIncrement();
        this.title = title;
        this.author = author;
        this.tags = tags.split(",");
        this.genre = Genre.OTHER;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getTags() {
        return tags;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "[" + isbn + "] " + title + " by " + author;
    }
}
