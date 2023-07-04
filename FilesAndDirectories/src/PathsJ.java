import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsJ {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Hello world.txt");
        Files.deleteIfExists(path);
    }
}
