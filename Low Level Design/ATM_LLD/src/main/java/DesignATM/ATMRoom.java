package DesignATM;

import java.util.Date;

public class ATMRoom {
    private ATM atm;
    private User user;

    public void initialize() {
        // Create ATM
        atm = ATM.getATMObject();
        atm.setAtmBalance(3500, 1, 2, 5);

        // Create User
        this.user = createUser();
    }

    private User createUser() {
        User user = new User();
        user.setName("sourabh");
        user.setCard(createCard(user));
        return user;
    }

    private Card createCard(User user) {
        Card card = new Card();
        card.setCardNumber("10001");
        card.setBankAccount(createBankAccount(user));
        card.setCvv(12345);
        card.setExpiryDate(new Date());
        card.setOwnerName("sourabh");
        return card;
    }

    private BankAccount createBankAccount(User user) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100000);
        user.setBankAccount(bankAccount);
        return bankAccount;
    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
