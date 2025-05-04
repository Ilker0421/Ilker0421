package library.commands;

import library.core.LibrarySystem;
import library.model.Book;
import library.model.Command;
import java.util.List;

public class BooksFindCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
//        if (args.length < 3) {
//            System.out.println("Usage: books find <keyword>");
//            return;
//        }
//        String keyword = args[2].toLowerCase();
//        List<Book> results = system.getBookManager().findBooks(keyword);
//        if (results.isEmpty()) {
//            System.out.println("No books found.");
//        } else {
//            for (Book book : results) {
//                System.out.println(book);
//            }
//        }
    }
}
