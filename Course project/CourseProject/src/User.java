import java.io.Serializable;

/**
 * Represents a user of the library system.
 * Contains user credentials and access level information.
 */
public class User implements Serializable {
    private String username;
    private String password;
    private boolean isAdmin;

    /**
     * Constructs a new User with the specified credentials and access level.
     *
     * @param username the username for the user
     * @param password the password for the user
     * @param isAdmin  whether the user has administrator privileges
     */
    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**
     * @return the username
     */
    public String getUsername() { return username; }

    /**
     * @return the password
     */
    public String getPassword() { return password; }

    /**
     * @return true if the user is an administrator, false otherwise
     */
    public boolean isAdmin() { return isAdmin; }

    /**
     * @return a string representation of the user in "username,password,role" format
     */
    @Override
    public String toString() {
        return String.format("%s,%s,%s", username, password, isAdmin ? "admin" : "user");
    }

    /**
     * Creates a User object from a string representation.
     *
     * @param str the string in "username,password,role" format
     * @return the created User object, or null if the string is invalid
     */
    public static User fromString(String str) {
        String[] parts = str.split(",");
        if (parts.length != 3) return null;
        return new User(parts[0], parts[1], parts[2].equals("admin"));
    }
}
