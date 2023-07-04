public class ATM {
    static synchronized void withdraw() {
        int balance = Users.account.getBalance();
        if ((balance - 100) < - Users.account.getOverdraft()) {
           System.out.println("Transaction denied!");
        } else {
            Users.account.debit();
            System.out.println("$" + 100 + " successfully withdrawn");
        }
        System.out.println("Current balance: " + Users.account.getBalance());
    }
}
