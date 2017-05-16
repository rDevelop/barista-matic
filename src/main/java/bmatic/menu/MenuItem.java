package bmatic.menu;

import bmatic.beverages.Drink;

/**
 * MenuItem represents on Drink and it's item number for the menu.
 */
public class MenuItem {
    private int itemNumber;
    private Drink drink;

    public MenuItem(int itemNumber, Drink drink) {
        this.itemNumber = itemNumber;
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return itemNumber + "," + drink;
    }
}
