import java.util.ArrayList;
import java.util.List;

public class UserManager
{
    private List<User> users;
    private User currentUser;

    /**
     * Constructs a new UserManager with a default admin user.
     */
    public UserManager() {
        users = new ArrayList<>();
        currentUser = null;
        // Добавяне на администратор по подразбиране
        users.add(new User("admin", "adminpass", true));
    }

    /**
     * Logs in a user with the specified username and password.
     *
     * @param username the username of the user
     * @param password the password of the user
     * @return true if login is successful, false otherwise
     */
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Successfully logged in as " + username);
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }

    /**
     * Logs out the currently logged-in user.
     */
    public void logout() {
        if (currentUser != null) {
            System.out.println("User " + currentUser.getUsername() + " logged out.");
            currentUser = null;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    /**
     * Registers a new user.
     *
     * @param username the username for the new user
     * @param password the password for the new user
     * @param isAdmin  true if the new user should have admin privileges, false otherwise
     */
    public void registerUser(String username, String password, boolean isAdmin) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("A user with the given username already exists.");
                return;
            }
        }
        users.add(new User(username, password, isAdmin));
        System.out.println("Successfully registered user: " + username);
    }

    /**
     * Checks if the currently logged-in user is an administrator.
     *
     * @return true if the user is an administrator, false otherwise
     */
    public boolean isAdmin() {
        if (currentUser != null) {
            return currentUser.isAdmin();
        }
        System.out.println("No user is currently logged in.");
        return false;
    }

    /**
     * @return the currently logged-in user, or null if no user is logged in
     */
    public User getCurrentUser() {
        return currentUser;
    }
}
