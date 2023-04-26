package DesignVendingMachine.VendingState.vendingStates.impl;

import DesignVendingMachine.VendingState.Coin;
import DesignVendingMachine.VendingState.Item;
import DesignVendingMachine.VendingState.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently vending machine in idle state");
    }

    public IdleState(VendingMachine machine) {
        machine.setCoinsList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertionCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("First you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("First you need to insert coin and choose product");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You cannot get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product cannot be returned in idle state");
    }

    @Override
    public List<Coin> refundAllMoney(VendingMachine machine) throws Exception {
        throw new Exception("You cannot get refund in idle status");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(codeNumber, item);
    }
}
