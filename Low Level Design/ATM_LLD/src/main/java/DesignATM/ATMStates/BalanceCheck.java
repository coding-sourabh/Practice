package DesignATM.ATMStates;

import DesignATM.ATM;
import DesignATM.Card;

public class BalanceCheck extends ATMState {
    @Override
    public void displayBalance(ATM atm, Card card) {
        card.displayBankBalance();
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        atm.setAtmState(new IdleState());
        returnCard();
        System.out.println("Exited");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
