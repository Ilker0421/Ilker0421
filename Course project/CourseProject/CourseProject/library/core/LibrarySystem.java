package library.core;

import library.model.User;
import library.model.Role;
import library.model.Book;
import library.service.BookManager;
import library.service.UserManager;

public class LibrarySystem {
    private User currentUser;
    private final BookManager bookManager;
    private final UserManager userManager;

    public LibrarySystem() {
        this.bookManager = new BookManager();
        this.userManager = new UserManager();
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public boolean isAdmin() {
        return currentUser != null && currentUser.getRole() == Role.ADMIN;
    }

    public BookManager getBookManager() {
        return bookManager;
    }

    public UserManager getUserManager() {
        return userManager;
    }
}
