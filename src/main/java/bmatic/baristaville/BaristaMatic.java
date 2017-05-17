package bmatic.baristaville;

import bmatic.beverages.Drink;
import bmatic.inventory.Inventory;
import bmatic.menu.BaristaMenu;
import bmatic.menu.MenuItem;

import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 * Implementation of the Barista contract.
 */
public class BaristaMatic implements Barista {
    final static int INVALID = -100;
    final static int RESTOCK = -200;
    final static int QUIT = -300;

    private Inventory inventory;
    private BaristaMenu menu;
    private Scanner scanner;
    private boolean running;

    public BaristaMatic() {
        scanner = new Scanner(System.in);
        inventory = new Inventory();
        menu = new BaristaMenu();
        running = true;
    }

    /**
     * start the Barista-Matic, called from App.main
     */
    @Override
    public void startMachine() {

        while (running) {
            showInventoryList();
            showMenu();
            int order = getOrder();
            if (order != QUIT && order != INVALID && order != RESTOCK) {
                Drink drink = menu.getItem(order).getDrink();
                if (isStocked(drink)) {
                    dispenseDrink(drink);
                    updateInventory(drink);
                } else {
                    System.out.println("Out of stock: " + drink.getDescription());
                }
            }
        }
    }


    /**
     * Print's the current inventory to standard out.
     */
    @Override
    public void showInventoryList() {
        System.out.println(inventory.inventoryList());
    }

    /**
     * List all items and availability in the BaristaMenu and checks if the item is in stock
     */
    @Override
    public void showMenu() {
        System.out.println("Menu:");
        menu.getItems().forEach(
                item -> {
                    MenuItem menuItem = (MenuItem) item;
                    System.out.println(menuItem + "," + isStocked(menuItem.getDrink()));
                }
        );
    }

    /**
     * Scan's the console input for commands and item number of menu items.
     *
     * @return integer representing 'q', 'r', or item number.
     */
    @Override
    public int getOrder() {
        while (scanner.hasNext()) {
            String in = null;
            try {
                in = scanner.next();
            } catch (NoSuchElementException | IllegalStateException e) {
                throw new RuntimeException(e);
            }
            if ("r".equalsIgnoreCase(in)) {
                inventory.restock();
                return RESTOCK;

            } else if ("q".equalsIgnoreCase(in)) {
                running = false;
                return QUIT;

            } else {
                int choice;

                try {
                    choice = Integer.valueOf(in);
                } catch (NumberFormatException e) {
                    printInvalidSelection(String.valueOf(in));
                    return INVALID;
                }

                if (choice > 0 && choice <= menu.getNumItems()) {
                    /*
                    *  Only valid return condition.
                    */
                    return choice;
                }
                printInvalidSelection(String.valueOf(choice));
                return INVALID;
            }
        }
        return INVALID;
    }

    /**
     * If input is not 'q', 'r', or valid item number, print invalid message.
     *
     * @param selection aka invalid input from console
     */
    private void printInvalidSelection(String selection) {
        System.out.println("Invalid selection: " + selection);
    }

    /**
     * Dispense the drink and update inventory
     *
     * @param drink that we will dispense.
     */
    @Override
    public void dispenseDrink(Drink drink) {
        System.out.println("Dispensing: " + drink.getDescription());
    }

    /**
     * Use the inventory update stock method to update inventory.
     *
     * @param drink to get ingredients to update.
     */
    @Override
    public void updateInventory(Drink drink) {
        inventory.updateStockFromDrink(drink);
    }

    /**
     * Call the inventory's method to see if inventory is stocked for a drink.
     *
     * @param drink with ingredients to check if are in the inventory.
     * @return false if there are not enough ingredients, true if there are.
     */
    @Override
    public boolean isStocked(Drink drink) {
        return inventory.isStockedForDrink(drink);
    }
}