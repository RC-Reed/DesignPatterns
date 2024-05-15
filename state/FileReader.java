// FileReader.java
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * The FileReader class provides a static method to read lyrics from a file.
 */
public class FileReader {
    /**
     * Reads the lyrics from a specified file and returns them as an ArrayList of strings.
     * 
     * @param fileName the name of the file containing the lyrics
     * @return an ArrayList of strings representing the lyrics of the song
     */
    public static ArrayList<String> getLyrics(String fileName) {
        try {
            File file = new File(fileName);
            List<String> lines = Files.readAllLines(file.toPath());
            return new ArrayList<>(lines);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
