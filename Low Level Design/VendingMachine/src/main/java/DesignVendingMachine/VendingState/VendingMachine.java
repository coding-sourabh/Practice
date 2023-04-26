package DesignVendingMachine.VendingState;

import DesignVendingMachine.VendingState.vendingStates.impl.IdleState;
import DesignVendingMachine.VendingState.vendingStates.impl.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Inventory inventory;
    private State vendingMachineState;
    List<Coin> coinsList;

    public VendingMachine() {
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinsList = new ArrayList<>();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinsList() {
        return coinsList;
    }

    public void setCoinsList(List<Coin> coinsList) {
        this.coinsList = coinsList;
    }
}
