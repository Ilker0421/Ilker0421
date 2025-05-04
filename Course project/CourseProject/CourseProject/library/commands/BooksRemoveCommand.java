package library.commands;

import library.core.LibrarySystem;
import library.model.Command;
public class BooksRemoveCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
        if (!system.isAdmin()) {
            System.out.println("Only admins can remove books.");
            return;
        }

        if (args.length < 3) {
            System.out.println("Usage: books remove <book_isbn>");
            return;
        }

        try {
            int isbn = Integer.parseInt(args[2]);
            if (system.getBookManager().removeBookByIsbn(isbn)) {
                System.out.println("Book removed.");
            } else {
                System.out.println("Book with ID not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid book ID.");
        }
    }
}
