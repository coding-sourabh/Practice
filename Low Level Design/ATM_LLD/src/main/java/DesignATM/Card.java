package DesignATM;

import java.util.Date;

public class Card {
    private String ownerName;
    private Integer cvv;
    private Date expiryDate;
    private static int PIN_MUMBER = 12345;

    private String cardNumber;
    private  BankAccount bankAccount;


    public boolean isCurrentPINEntered(int pin) {
        if(PIN_MUMBER == pin) {
            return true;
        } else {
            return false;
        }
    }

    public void displayBankBalance() {
        System.out.println("Your current bank balance is : " + bankAccount.getBalance());
    }

    public void withdraw(int withdrawAmt) {
        bankAccount.withdrawBalance(withdrawAmt);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
