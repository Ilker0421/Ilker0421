import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a book in the library system.
 * Contains all relevant information about a book.
 */
public class Book implements Serializable {
    private String author;
    private String title;
    private String genre;
    private String description;
    private int year;
    private List<String> tags;
    private double rating;
    private String isbn;

    /**
     * Constructs a new Book with the specified details.
     *
     * @param author      the author of the book
     * @param title       the title of the book
     * @param genre       the genre of the book
     * @param description a brief description of the book
     * @param year        the year the book was published
     * @param tags        a list of tags/keywords associated with the book
     * @param rating      the rating of the book (0.0 to 5.0)
     * @param isbn        the unique ISBN number of the book
     */
    public Book(String author, String title, String genre, String description,
                int year, List<String> tags, double rating, String isbn) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.tags = new ArrayList<>(tags);
        this.rating = rating;
        this.isbn = isbn;
    }

    /**
     * @return the author of the book
     */
    public String getAuthor() { return author; }

    /**
     * @return the title of the book
     */
    public String getTitle() { return title; }

    /**
     * @return the genre of the book
     */
    public String getGenre() { return genre; }

    /**
     * @return the description of the book
     */
    public String getDescription() { return description; }

    /**
     * @return the publication year of the book
     */
    public int getYear() { return year; }

    /**
     * @return a copy of the list of tags associated with the book
     */
    public List<String> getTags() { return new ArrayList<>(tags); }

    /**
     * @return the rating of the book
     */
    public double getRating() { return rating; }

    /**
     * @return the ISBN of the book
     */
    public String getIsbn() { return isbn; }

    /**
     * @return a string representation of the book with all details
     */
    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nGenre: %s\nYear: %d\nRating: %.1f\nISBN: %s\nDescription: %s\nTags: %s",
                title, author, genre, year, rating, isbn, description, String.join(", ", tags));
    }

    /**
     * @return a short string representation of the book (title, author, genre, ISBN)
     */
    public String toShortString() {
        return String.format("%s, %s, %s, %s, %s", title, author, genre, year, isbn);
    }
}
