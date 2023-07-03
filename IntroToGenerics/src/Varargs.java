package src;

import java.util.stream.IntStream;

public class Varargs {
    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};
        printShoppingList(item1, item2, item3);
        printShoppingList(shopping);
    }

    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        IntStream .range(0, items.length)
                .mapToObj(i -> "i: " + (i + 1) + " " + items[i])
                .forEach(System.out::println);
    }
}
