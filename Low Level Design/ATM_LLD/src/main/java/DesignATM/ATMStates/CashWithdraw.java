package DesignATM.ATMStates;

import DesignATM.ATM;
import DesignATM.AmountWithdrawal.CashWithdrawProcessor;
import DesignATM.AmountWithdrawal.FiveHundredWithdrawProcessor;
import DesignATM.AmountWithdrawal.OneHunderedWithdrawProcessor;
import DesignATM.AmountWithdrawal.TwoThousandWithdrawProcessor;
import DesignATM.Card;

public class CashWithdraw extends ATMState {
    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmt) {
        if(atm.getAtmBalance() < withdrawAmt) {
            System.out.println("Insufficient balance in ATM");
        } else if(card.getBankAccount().getBalance() < withdrawAmt) {
            System.out.println("Insufficient balance in your bank account");
        } else {
            card.withdraw(withdrawAmt);
            atm.deductAmount(withdrawAmt);

            // Chain of responsibility design pattern is used here for amount withdrawal
            CashWithdrawProcessor cashWithdrawProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHunderedWithdrawProcessor(null)));
            cashWithdrawProcessor.withdraw(atm, withdrawAmt);
        }
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        atm.setAtmState(new IdleState());
        returnCard();
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
