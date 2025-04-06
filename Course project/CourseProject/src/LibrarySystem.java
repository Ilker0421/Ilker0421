import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private User currentUser = null;

    public void login(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                currentUser = user;
                System.out.println("Welcome, " + username + "!");
                return;
            }
        }
        System.out.println("Incorrect username or password.");
    }

    public void logout() {
        if (currentUser != null) {
            System.out.println("Goodbye, " + currentUser.username + "!");
            currentUser = null;
        } else {
            System.out.println("No user is logged in.");
        }
    }

    public void addUser(String username, String password, boolean isAdmin) {
        if (currentUser != null && currentUser.isAdmin) {
            users.add(new User(username, password, isAdmin));
            System.out.println("User added: " + username);
        } else {
            System.out.println("Permission denied.");
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author +
                    ", Genre: " + book.genre + ", ID: " + book.uniqueID);
        }
    }

    public void bookInfo(int uniqueID) {
        for (Book book : books) {
            if (book.uniqueID == uniqueID) {
                System.out.println("Title: " + book.title + "\nAuthor: " + book.author +
                        "\nGenre: " + book.genre + "\nDescription: " + book.description +
                        "\nYear: " + book.year + "\nRating: " + book.rating);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}