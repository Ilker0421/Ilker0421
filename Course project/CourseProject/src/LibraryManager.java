import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager
{
    private List<Book> books;
    private FileHandler<List<Book>> fileHandler;
    private String currentFilePath;

    public LibraryManager() {
        books = new ArrayList<>();
        fileHandler = new FileHandler<>();
        currentFilePath = null;
    }

    /**
     * Opens a file and loads its content into the library.
     *
     * @param filePath the path to the file
     * @throws IOException if a file error occurs
     * @throws ClassNotFoundException if the file contains invalid data
     */
    public void openFile(String filePath) throws IOException, ClassNotFoundException {
        books = fileHandler.load(filePath);
        currentFilePath = filePath;
        System.out.println("Successfully opened " + filePath);
    }

    /**
     * Closes the currently opened file.
     */
    public void closeFile() {
        books.clear();
        currentFilePath = null;
        System.out.println("Successfully closed the file.");
    }

    /**
     * Saves the library data to the currently opened file.
     *
     * @throws IOException if a file error occurs
     */
    public void saveFile() throws IOException {
        if (currentFilePath != null) {
            fileHandler.save(currentFilePath, books);
            System.out.println("Successfully saved the file.");
        } else {
            System.out.println("No file is currently open.");
        }
    }

    /**
     * Saves the library data to a new file.
     *
     * @param filePath the path to the new file
     * @throws IOException if a file error occurs
     */
    public void saveAsFile(String filePath) throws IOException {
        fileHandler.save(filePath, books);
        currentFilePath = filePath;
        System.out.println("Successfully saved the file as " + filePath);
    }

    /**
     * Adds a book to the library.
     *
     * @param book the book to add
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    /**
     * Lists all books in the library.
     */
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            books.forEach(System.out::println);
        }
    }
}
