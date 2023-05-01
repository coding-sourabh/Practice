package DesignATM.AmountWithdrawal;

import DesignATM.ATM;

public class FiveHundredWithdrawProcessor extends  CashWithdrawProcessor{
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount / 500;
        int balance = remainingAmount % 500;

        if(required <= atm.getNoOfFiveHundredNote()) {
            atm.deductFiveHundredNotes(required);
        } else if(required > atm.getNoOfFiveHundredNote()) {
            balance += (required - atm.getNoOFHundredNote()) * 500;
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNote());
        }

        if(balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
