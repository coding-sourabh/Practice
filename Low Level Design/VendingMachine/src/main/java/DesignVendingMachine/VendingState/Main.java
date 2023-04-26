package DesignVendingMachine.VendingState;

import DesignVendingMachine.VendingState.vendingStates.impl.State;

public class Main {
    public static void main(String [] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("Filling yup the inventory");
            fillUpInventory(vendingMachine);

            // *******************************************************
            System.out.println("Displaying inventory");
            displayInventory(vendingMachine);
            // *******************************************************
            System.out.println("Click on insert coin button");
            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertionCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.NICKLE);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
            // *******************************************************
            System.out.println("Click on product selection button");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);
            // *******************************************************
            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine,102);
            // *******************************************************
            displayInventory(vendingMachine);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            displayInventory(vendingMachine);
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if(i >=0 && i<3) {
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i >=3 && i<5){
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(9);
            }else if(i >=5 && i<7){
                newItem.setItemType(ItemType.TEA);
                newItem.setPrice(13);
            }else if(i >=7 && i<10){
                newItem.setItemType(ItemType.MILK);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }

    }

    private static void displayInventory(VendingMachine machine) {
        ItemShelf[] slots = machine.getInventory().getInventory();

        for(int i = 0; i < slots.length; i++) {
            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getItemType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }
}
