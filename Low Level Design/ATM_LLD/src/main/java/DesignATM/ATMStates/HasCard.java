package DesignATM.ATMStates;

import DesignATM.ATM;
import DesignATM.Card;

public class HasCard extends ATMState {
    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isCorrectPinEntered = card.isCurrentPINEntered(pin);

        if(isCorrectPinEntered) {
            atm.setAtmState(new SelectOperation());
        } else {
            System.out.println("Invalid pin");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Exiting..");
    }

    @Override
    public void returnCard() {
        System.out.println("Card is returned");
    }
}
