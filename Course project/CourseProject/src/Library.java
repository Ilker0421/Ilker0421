import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;
    private String currentFilePath;
    private User currentUser;

    /**
     * Constructs a new Library with default admin user and empty book list.
     */
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        currentUser = null;
        users.add(new User("admin", "iamsa", true)); // Default admin
    }
}