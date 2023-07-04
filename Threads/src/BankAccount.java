public class BankAccount {
    private int balance = 0;
    private final int overdraft;

    public BankAccount(int overdraft) {
        this.overdraft = overdraft;
    }
    void topUp() {
        balance += 100;
    }

    void debit() {
        balance -= 100;
    }

    int getBalance() {
        return balance;
    }
    int getOverdraft() {
        return overdraft;
    }
}

