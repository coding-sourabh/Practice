package DesignATM.AmountWithdrawal;

import DesignATM.ATM;

public class CashWithdrawProcessor {
    CashWithdrawProcessor nextCashWithdrawProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        this.nextCashWithdrawProcessor = cashWithdrawProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount) {
        if(nextCashWithdrawProcessor != null) {
            nextCashWithdrawProcessor.withdraw(atm, remainingAmount);
        }
    }
}
