package library.commands;

import library.core.LibrarySystem;
import library.model.Command;
public class ExitCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
        System.out.println("Exiting the system...");
        System.exit(0);
    }
}
