import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourcesJ {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader reader = new BufferedReader(new StringReader("Hello World!"));
                StringWriter writer = new StringWriter()
        ) {
            writer.write(reader.readLine());
            System.out.println(writer);
        }
    }
}
