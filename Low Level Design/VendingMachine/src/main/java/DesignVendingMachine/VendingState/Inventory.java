package DesignVendingMachine.VendingState;

public class Inventory {
    ItemShelf [] inventory = null;

    Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        initializeInventory();
    }

    public void initializeInventory() {
        int startCode = 101;
        for(int i = 0; i < inventory.length; i++) {
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(startCode);
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
            startCode++;
        }
    }

    public void addItem(int code, Item item) throws Exception {
        for(ItemShelf itemShelf: inventory) {
            if(itemShelf.getCode() == code) {
                if(itemShelf.isSoldOut()) {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("Already this item is present, you can add item here");
                }
            }
        }
    }

    public Item getItem(int code) throws Exception {
        for(ItemShelf itemShelf: inventory) {
            if(itemShelf.getCode() == code) {
                if(itemShelf.isSoldOut()) {
                    throw new Exception("DesignVendingMachine.VendingState.Item already sold out");
                } else {
                    return itemShelf.getItem();
                }
            }
        }
        throw new Exception("Invalid code");
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void updateSoldOutItem(int code) {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == code) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
