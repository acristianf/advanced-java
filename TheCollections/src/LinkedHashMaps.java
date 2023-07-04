import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    static LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(4, 0.75f, false);

    public static void main(String[] args) {
        phoneBook.put("Cristian", 2131);
        phoneBook.put("Lu", 12231);
        phoneBook.put("Marisa", 12321);
        System.out.println("Cristian's number: " + phoneBook.get("Cristian"));
        System.out.println("\nList of contacts in phonebook:");
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
