package library.commands;

import library.core.LibrarySystem;
import library.model.Command;
public class HelpCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
        System.out.println("Available commands:");
        System.out.println("login <username>");
        System.out.println("logout");
        System.out.println("books all");
        System.out.println("books find <keyword>");
        System.out.println("books add");
        System.out.println("books remove <book_id>");
        System.out.println("users add");
        System.out.println("users remove <username>");
        System.out.println("help");
        System.out.println("exit");
    }
}
