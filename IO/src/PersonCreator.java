import java.util.Scanner;

public class PersonCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name, age and phone number: ");
        String name = scanner.next();
        int age = Integer.parseInt(scanner.next());
        long phoneNumber = scanner.nextLong();
        Person p = new Person(name, age, phoneNumber);
        System.out.println(p);
    }
}
