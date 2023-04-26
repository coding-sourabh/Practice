package DesignVendingMachine.VendingState.vendingStates.impl;

import DesignVendingMachine.VendingState.Coin;
import DesignVendingMachine.VendingState.Item;
import DesignVendingMachine.VendingState.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnInsertionCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public List<Coin> refundAllMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
