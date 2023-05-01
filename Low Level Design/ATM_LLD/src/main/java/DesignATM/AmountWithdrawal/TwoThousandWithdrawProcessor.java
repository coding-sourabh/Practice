package DesignATM.AmountWithdrawal;

import DesignATM.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor {
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmt) {
        int required = remainingAmt / 2000;
        int balance = remainingAmt % 2000;

        if(required <= atm.getNoOfTwoThousandNote()) {
            atm.deductTwoThousandNotes(required);
        } else if(required > atm.getNoOfTwoThousandNote()) {
            balance += balance + (required - atm.getNoOfTwoThousandNote()) * 2000;
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNote());
        }

        if(balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
