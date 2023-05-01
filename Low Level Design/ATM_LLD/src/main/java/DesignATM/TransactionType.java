package DesignATM;

public enum TransactionType {
    CASH_WITHDRAWAL,
    BALANCE_ChECK;

    public static void showALLTransactionTypes() {
        for(TransactionType transactionType: TransactionType.values()) {
            System.out.println(transactionType.name());
        }
    }
}
