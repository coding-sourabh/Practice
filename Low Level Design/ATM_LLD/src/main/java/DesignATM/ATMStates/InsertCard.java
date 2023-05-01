package DesignATM.ATMStates;

import DesignATM.ATM;
import DesignATM.Card;

public class InsertCard extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCard());
    }
}
