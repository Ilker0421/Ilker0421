import java.io.*;
import java.util.List;

public class FileHandler<T>
{

    /**
     * Loads data from a file and returns it as an object.
     *
     * @param filePath the path to the file
     * @return the loaded object
     * @throws IOException if a file error occurs
     * @throws ClassNotFoundException if the file contains invalid data
     */
    public T load(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (T) ois.readObject();
        }
    }

    /**
     * Saves data to a file.
     *
     * @param filePath the path to the file
     * @param data     the data to save
     * @throws IOException if a file error occurs
     */
    public void save(String filePath, T data) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(data);
            System.out.println("Successfully saved the file: " + filePath);
        }
    }
}
