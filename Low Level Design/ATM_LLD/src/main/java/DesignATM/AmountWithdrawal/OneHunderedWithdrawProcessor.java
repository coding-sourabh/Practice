package DesignATM.AmountWithdrawal;

import DesignATM.ATM;

public class OneHunderedWithdrawProcessor extends  CashWithdrawProcessor{
    public OneHunderedWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount / 100;
        int balance = remainingAmount % 100;

        if(required <= atm.getNoOFHundredNote()) {
            atm.deductOneHundredNote(required);
        } else if(required > atm.getNoOFHundredNote()) {
            balance += (required - atm.getNoOFHundredNote()) * 100;
            atm.deductOneHundredNote(atm.getNoOFHundredNote());
        }

        if(balance != 0) {
            System.out.println("something went wrong");
        }
    }
}
