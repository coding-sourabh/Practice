package DesignATM.ATMStates;

import DesignATM.ATM;
import DesignATM.Card;
import DesignATM.TransactionType;

public class SelectOperation extends ATMState {

    public SelectOperation() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        switch (txnType) {
            case CASH_WITHDRAWAL:
                atm.setAtmState(new CashWithdraw());
                break;
            case BALANCE_ChECK:
                atm.setAtmState(new BalanceCheck());
                break;
            default:
                System.out.println("Invalid operation");
                exit(atm);
                break;
        }
    }

        @Override
        public void exit(ATM atm) {
            returnCard();
            atm.setAtmState(new IdleState());
            System.out.println("Exited");
        }

        @Override
        public void returnCard() {
            System.out.println("Please collect your card");
        }

        public void showOperations() {
           TransactionType.showALLTransactionTypes();
        }
}
