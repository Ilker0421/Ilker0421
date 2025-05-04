package library.util;

import java.io.Console;

public class ConsoleUtils {

    public static String readPassword(String prompt) {
        Console console = System.console();
        if (console == null) {
            throw new IllegalStateException("No console available");
        }

        char[] passwordArray = console.readPassword(prompt);
        return new String(passwordArray);
    }


    public static String readLine(String prompt) {
        Console console = System.console();
        if (console == null) {
            throw new IllegalStateException("No console available");
        }

        return console.readLine(prompt);
    }
}
