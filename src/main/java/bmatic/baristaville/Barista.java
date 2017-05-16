package bmatic.baristaville;

import bmatic.beverages.Drink;

/**
 * Contract for what a Barista needs to do to run the Barista-Matic
 */
public interface Barista {
    void startMachine();

    void showInventoryList();

    void showMenu();

    int getOrder();

    void dispenseDrink(Drink drink);

    void updateInventory(Drink drink);

    boolean isStocked(Drink drink);

}
