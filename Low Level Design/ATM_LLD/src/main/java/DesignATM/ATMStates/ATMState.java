package DesignATM.ATMStates;

public abstract class ATMState {
    public abstract void insertCard();

    public abstract void hasCard();

    public abstract void selectOperation();

    public abstract void cashWithdraw();

    public abstract void balanceCheck();
}
