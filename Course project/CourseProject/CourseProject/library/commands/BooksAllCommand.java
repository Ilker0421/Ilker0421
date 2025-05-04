package library.commands;

import library.core.LibrarySystem;
import library.model.Book;
import library.model.Command;

public class BooksAllCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
        for (Book book : system.getBookManager().getAllBooks()) {
            System.out.println(book);
        }
    }
}
