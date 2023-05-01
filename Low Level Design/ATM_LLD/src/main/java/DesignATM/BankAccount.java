package DesignATM;

public class BankAccount {
    private Integer balance;

    public void withdrawBalance(int amt) {
        balance -= amt;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
