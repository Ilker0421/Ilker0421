package library.commands; // Пакетът на класа BooksAddCommand

import library.model.Command; // Импортиране на интерфейса Command от пакета model
import library.core.LibrarySystem;
import library.model.Book;

import java.util.Scanner;

public class BooksAddCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
        if (!system.isAdmin()) {
            System.out.println("Only admins can add books.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Tags (comma-separated): ");
        String tags = scanner.nextLine();

        Book book = new Book(title, author, tags);
        system.getBookManager().addBook(book);
        System.out.println("Book added successfully.");
    }
}
