import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Cristian", 124141241);
        phoneBook.put("Jose", 2304204);
        phoneBook.put("Yami", 32402914);
        phoneBook.remove("Cristian");
        System.out.println(phoneBook);
    }
}
