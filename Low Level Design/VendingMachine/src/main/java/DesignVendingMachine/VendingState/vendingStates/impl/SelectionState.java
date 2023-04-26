package DesignVendingMachine.VendingState.vendingStates.impl;

import DesignVendingMachine.VendingState.Coin;
import DesignVendingMachine.VendingState.Item;
import DesignVendingMachine.VendingState.VendingMachine;

import java.util.List;

public class SelectionState implements State {
    public SelectionState() {
        System.out.println("Currently Vending Machine is in selection state");
    }

    @Override
    public void clickOnInsertionCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click insert coin button in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item = machine.getInventory().getItem(codeNumber);

        int paidAmount = 0;
        for(Coin coin: machine.getCoinsList()) {
            paidAmount += coin.value;
        }

        if(paidAmount < item.getPrice()) {
            System.out.println("Amount paid not sufficient, your paid amount : " + paidAmount + ", item price : " + item.getPrice());
            refundAllMoney(machine);
            throw new Exception("Amount insufficient");
        } else {
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in change expense tray which is : " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public List<Coin> refundAllMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount in coin dispense tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinsList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }
}
