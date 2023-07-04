import java.io.File;
import java.io.FilenameFilter;

public class Directories {
    public static void main(String[] args) {
        // Get all directories and filter them
        FilenameFilter filter = (file, fileName) -> fileName.contains(".");
        String[] contents = new File(".").list(filter);
        assert contents != null;
        for (String file : contents) {
            System.out.println(file);
        }

        boolean directoryCreated = new File("MyDirectory").mkdir();
        System.out.println(directoryCreated);
    }
}
