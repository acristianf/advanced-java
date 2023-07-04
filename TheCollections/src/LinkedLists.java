import java.util.LinkedList;

// In most cases ArrayLists are better than LinkedLists,
// LinkedLists take more space in memory and don't have that many
// advantages over ArrayLists, the two biggest advantages are
// fast insertion and deletion
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> keys = new LinkedList<>();
        keys.add("A");
        keys.add("B");
        keys.add(1, "C");
        System.out.println(keys);
        keys.remove("B");
        System.out.println(keys);
    }
}
