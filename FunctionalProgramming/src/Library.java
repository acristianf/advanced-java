import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.stream()
                .filter(book -> book.getAuthor().startsWith("B"))
                .filter(book -> book.getTitle().startsWith("T"))
                .forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("B1", "T1"));
        books.add(new Book("D2", "T2"));
        books.add(new Book("B3", "X3"));
        books.add(new Book("C4", "T4"));
        books.add(new Book("B5", "T5"));
        return books;
    }
}
