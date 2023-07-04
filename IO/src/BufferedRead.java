import java.io.*;

public class BufferedRead {
    public static void main(String[] args) {
        File myFile = new File("Person.java");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
