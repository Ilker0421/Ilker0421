import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void start()
    {
        int choice;
        do {
            System.out.println("\n--- Библиотека Меню ---");
            System.out.println("1. Добавяне на книга");
            System.out.println("2. Преглед на книги");
            System.out.println("3. Изход");
            System.out.print("Изберете опция: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Изчистване на потока

            switch (choice) {
                case 1 :
                    addBook();
                    break;
                case 2 :
                    viewBooks();
                    break;
                case 3 :
                    System.out.println("Довиждане!");
                    break;
                default :
                    System.out.println("Невалидна опция. Опитайте отново.");
                    break;
            }
        } while (choice != 3);
    }

    public void addBook()
    {
        System.out.println("Въведете автор:");
        String author = scanner.nextLine();
        System.out.println("Въведете заглавие:");
        String title = scanner.nextLine();
        System.out.println("Въведете жанр:");
        String genre = scanner.nextLine();
        System.out.println("Въведете описание:");
        String description = scanner.nextLine();
        System.out.println("Въведете година на издаване:");
        int year = scanner.nextInt();
        System.out.println("Въведете рейтинг:");
        double rating = scanner.nextDouble();
        System.out.println("Въведете уникален номер:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(author, title, genre, description, year, rating, id);
        books.add(book);
        System.out.println("Книгата е добавена успешно!");
    }

    public void viewBooks()
    {
        if (books.isEmpty())
        {
            System.out.println("Няма налични книги.");
        }
        else
        {
            for (Book book : books)
            {
                System.out.println(book);
            }
        }
    }
}
