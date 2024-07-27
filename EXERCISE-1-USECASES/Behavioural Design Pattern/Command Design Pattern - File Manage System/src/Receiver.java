import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Receiver class that performs the actual operations
public class Receiver {
    // Creates a new file or notifies if it already exists
    public void createFile(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + filename);
            } else {
                System.out.println("File already exists: " + filename);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Deletes the specified file
    public void deleteFile(String filename) {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("Deleted file: " + filename);
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Appends content to an existing file
    public void updateFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
            System.out.println("File updated: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }
}
