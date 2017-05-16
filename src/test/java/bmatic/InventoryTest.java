package bmatic;

import bmatic.beverages.CaffeAmericano;
import bmatic.beverages.Drink;
import bmatic.inventory.Inventory;
import org.junit.Test;

/**
 * Tests the Inventory methods
 */
public class InventoryTest {
    @Test
    public void inventoryListTest() {
        Inventory inventory = new Inventory();
        // check inventoryList output
        // contains
        assert (inventory.inventoryList().contains("Cocoa,10"));
        assert (inventory.inventoryList().contains("Coffee,10"));
        assert (inventory.inventoryList().contains("Cream,10"));
        assert (inventory.inventoryList().contains("Decaf Coffee,10"));
        assert (inventory.inventoryList().contains("Espresso,10"));
        assert (inventory.inventoryList().contains("Foamed Milk,10"));
        assert (inventory.inventoryList().contains("Steamed Milk,10"));
        assert (inventory.inventoryList().contains("Sugar,10"));
        assert (inventory.inventoryList().contains("Whipped Cream,10"));
        // doesn't contain
        assert (!inventory.inventoryList().contains("Whipped Cream,0"));
        assert (!inventory.inventoryList().contains("Peanut Butter,10"));
    }

    @Test
    public void updateInventoryTest() {
        Inventory inventory = new Inventory();
        inventory.setCocoa(inventory.getCocoa() - 3);
        assert (inventory.inventoryList().contains("Cocoa,7"));
        inventory.setCocoa(50);
        assert (inventory.inventoryList().contains("Cocoa,50"));
        // there could be a reason to use negative values, ie. back orders)
        inventory.setSugar(-1);
        assert (inventory.inventoryList().contains("Sugar,-1"));
        inventory.setSugar(inventory.getSugar() + 9);
        assert (inventory.inventoryList().contains("Sugar,8"));

    }

    @Test
    public void updateInventorybByDrink() {
        Inventory inventory = new Inventory();
        Drink drink = new CaffeAmericano();
        inventory.setCocoa(inventory.getCocoa() - drink.getCocoa());
        inventory.setCoffee(inventory.getCoffee() - drink.getCoffee());
        inventory.setCream(inventory.getCream() - drink.getCream());
        inventory.setDecafCoffee(inventory.getDecafCoffee() - drink.getDecafCoffee());
        inventory.setEspresso(inventory.getEspresso() - drink.getEspresso());
        inventory.setFoamedMilk(inventory.getFoamedMilk() - drink.getFoamedMilk());
        inventory.setSteamedMilk(inventory.getSteamedMilk() - drink.getSteamedMilk());
        inventory.setSugar(inventory.getSugar() - drink.getSugar());
        inventory.setWhippedCream(inventory.getWhippedCream() - drink.getWhippedCream());
        assert (inventory.inventoryList().contains("Cocoa,10"));
        assert (inventory.inventoryList().contains("Coffee,10"));
        assert (inventory.inventoryList().contains("Cream,10"));
        assert (inventory.inventoryList().contains("Decaf Coffee,10"));
        assert (inventory.inventoryList().contains("Espresso,7"));
        assert (inventory.inventoryList().contains("Foamed Milk,10"));
        assert (inventory.inventoryList().contains("Steamed Milk,10"));
        assert (inventory.inventoryList().contains("Sugar,10"));
    }

    @Test
    public void reloadInventoryTest() {
        Inventory inventory = new Inventory();
        inventory.setSugar(0);
        inventory.setCocoa(2);
        inventory.setCoffee(9);
        assert (inventory.inventoryList().contains("Cocoa,2"));
        assert (inventory.inventoryList().contains("Coffee,9"));
        assert (inventory.inventoryList().contains("Cream,10"));
        assert (inventory.inventoryList().contains("Decaf Coffee,10"));
        assert (inventory.inventoryList().contains("Espresso,10"));
        assert (inventory.inventoryList().contains("Foamed Milk,10"));
        assert (inventory.inventoryList().contains("Steamed Milk,10"));
        assert (inventory.inventoryList().contains("Sugar,0"));

        inventory.restock();
        assert (inventory.inventoryList().contains("Cocoa,10"));
        assert (inventory.inventoryList().contains("Coffee,10"));
        assert (inventory.inventoryList().contains("Cream,10"));
        assert (inventory.inventoryList().contains("Decaf Coffee,10"));
        assert (inventory.inventoryList().contains("Espresso,10"));
        assert (inventory.inventoryList().contains("Foamed Milk,10"));
        assert (inventory.inventoryList().contains("Steamed Milk,10"));
        assert (inventory.inventoryList().contains("Sugar,10"));
    }
}
