package library.commands;

import library.core.LibrarySystem;
import library.model.User;
import java.util.Scanner;
import library.model.Command;
public class LoginCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
        if (system.getCurrentUser() != null) {
            System.out.println("You are already logged in as " + system.getCurrentUser().getUsername());
            return;
        }

        if (args.length < 2) {
            System.out.println("Usage: login <username>");
            return;
        }

        String username = args[1];
        System.out.print("Password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        User user = system.getUserManager().authenticate(username, password);
        if (user != null) {
            system.setCurrentUser(user);
            System.out.println("Successfully logged in as " + username);
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
