import java.util.List;

public class Book {
    String author;
    String title;
    String genre;
    String description;
    int year;
    List<String> keywords;
    double rating;
    int uniqueID;

    public Book(String author, String title, String genre, String description, int year, List<String> keywords, double rating, int uniqueID) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.keywords = keywords;
        this.rating = rating;
        this.uniqueID = uniqueID;
    }
}


