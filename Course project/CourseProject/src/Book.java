import java.util.ArrayList;

public class Book
{
    String author;
    String title;
    String genre;
    String description;
    int year;
    ArrayList<String> keywords = new ArrayList<>();
    double rating;
    int id;

    public Book(String author, String title, String genre, String description, int year, double rating, int id)
    {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.rating = rating;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Автор: " + author + ", Заглавие: " + title + ", Жанр: " + genre +
                ", Година: " + year + ", Рейтинг: " + rating + ", ID: " + id;
    }
}

