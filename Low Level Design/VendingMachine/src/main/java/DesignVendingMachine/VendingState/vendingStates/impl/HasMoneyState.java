package DesignVendingMachine.VendingState.vendingStates.impl;

import DesignVendingMachine.VendingState.Coin;
import DesignVendingMachine.VendingState.Item;
import DesignVendingMachine.VendingState.VendingMachine;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Currently vending machine is in has money state");
    }

    @Override
    public void clickOnInsertionCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        machine.getCoinsList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }


    @Override
    public List<Coin> refundAllMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount in coin dispensed tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinsList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");
    }
}
