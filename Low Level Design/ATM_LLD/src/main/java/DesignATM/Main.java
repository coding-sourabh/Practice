package DesignATM;

public class Main {
    public static void main(String [] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();
        atmRoom.getAtm().printCurrentState();
        atmRoom.getAtm().getAtmState().insertCard(atmRoom.getAtm(), atmRoom.getUser().getCard());
        atmRoom.getAtm().getAtmState().authenticatePin(atmRoom.getAtm(), atmRoom.getUser().getCard(), 12345);
        atmRoom.getAtm().getAtmState().selectOperation(atmRoom.getAtm(), atmRoom.getUser().getCard(), TransactionType.CASH_WITHDRAWAL);
        atmRoom.getAtm().getAtmState().cashWithdrawal(atmRoom.getAtm(), atmRoom.getUser().getCard(), 2700);
        System.out.println(atmRoom.getUser().getBankAccount().getBalance());
        atmRoom.getAtm().printCurrentState();
    }
}
