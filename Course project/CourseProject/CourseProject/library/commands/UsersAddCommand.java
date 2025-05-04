package library.commands;

import library.core.LibrarySystem;
import library.model.Role;
import library.model.User;
import library.model.Command;
import java.util.Scanner;

public class UsersAddCommand implements Command {
    @Override
    public void execute(String[] args, LibrarySystem system) {
//        if (!system.isAdmin()) {
//            System.out.println("Only admins can add users.");
//            return;
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Username: ");
//        String username = scanner.nextLine();
//        System.out.print("Password: ");
//        String password = scanner.nextLine();
//        System.out.print("Role (ADMIN/CLIENT): ");
//        String roleInput = scanner.nextLine().toUpperCase();
//
//        Role role = Role.valueOf(roleInput);
//        User user = new User(username, password, role);
//        system.getUserManager().addUser(user);
//        System.out.println("User added successfully.");
    }
}
