import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get(".\\text.txt");
        Path dest = Paths.get(".\\new.txt");
        Files.copy(source, dest, REPLACE_EXISTING);
    }
}
