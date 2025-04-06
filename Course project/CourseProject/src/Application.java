import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        library.addUser("admin", "1234", true);
        library.login("admin", "1234");

        List<String> keywords = new ArrayList<>();
        keywords.add("Keyword1");
        keywords.add("Keyword2");

        Book exampleBook = new Book("Author A", "Book A", "Genre A", "Description A", 2025, keywords, 4.5, 1);
        library.addBook(exampleBook);

        library.listBooks();
        library.bookInfo(1);

        library.logout();
    }
}

