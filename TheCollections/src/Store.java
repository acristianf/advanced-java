import java.util.LinkedList;

public class Store {
    static LinkedList<Customer> customers = new LinkedList<>();

    public static void main(String[] args) {
        customers.add(new Customer("Cristian"));
        customers.add(new Customer("Jose"));
        System.out.println(customers);
        serveCustomer(customers);
        System.out.println(customers);
    }

    private static void serveCustomer(LinkedList<Customer> queue) {
        Customer c = queue.poll();
        assert c != null;
        c.serve();
    }
}
