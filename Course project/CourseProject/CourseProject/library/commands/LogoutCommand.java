package library.commands;

import library.core.LibrarySystem;
import library.model.Command;
public class LogoutCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
        if (system.getCurrentUser() == null) {
            System.out.println("No user is currently logged in.");
        } else {
            System.out.println("User " + system.getCurrentUser().getUsername() + " logged out.");
            system.setCurrentUser(null);
        }
    }
}
