public class Users {
    static final BankAccount account = new BankAccount(50);

    public static void main(String[] args) {
        account.topUp();
        Thread t1 = new Thread(ATM::withdraw);
        Thread t2 = new Thread(ATM::withdraw);
        t1.start();
        t2.start();
    }
}
