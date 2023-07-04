public class Person {
    private final String name;
    private final int age;
    private final long phoneNumber;

    public Person(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("Person created. Name: " + this.name +
                ", Age: " + this.age + ", Phone Number: " + this.phoneNumber);
    }
}
