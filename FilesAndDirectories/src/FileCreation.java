import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        File myFile = new File(".\\text.txt");
        boolean fileCreated = myFile.createNewFile();
        System.out.println(fileCreated);
    }
}
