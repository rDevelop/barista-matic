package bmatic.menu;

import bmatic.beverages.*;

import java.util.ArrayList;
import java.util.List;

/**
 * A list of MenuItems initiated with item number.
 */
public class BaristaMenu {
    List<MenuItem> menuItems = new ArrayList<>(0);

    public BaristaMenu() {
        defaultMenu();
    }

    /**
     * Create the default menu for the Barista
     */
    private void defaultMenu() {
        menuItems.add(new MenuItem(1, new CaffeAmericano()));
        menuItems.add(new MenuItem(2, new CaffeLatte()));
        menuItems.add(new MenuItem(3, new CaffeMocha()));
        menuItems.add(new MenuItem(4, new Cappuccino()));
        menuItems.add(new MenuItem(5, new Coffee()));
        menuItems.add(new MenuItem(6, new DecafCoffee()));
    }

    /**
     * The menu could potentially grow or shrink in the future
     *
     * @return number of items in the menu
     */
    public int getNumItems() {
        return menuItems.size();
    }

    /**
     * Allows other classes to get the menu Items
     *
     * @return menu items
     */
    public List getItems() {
        return menuItems;
    }

    /**
     * Zero indexed List needs look at selection -1
     *
     * @param itemNumber of the Drink in the menu
     * @return the MenuItem which contains a drink.
     */
    public MenuItem getItem(int itemNumber) {
        return menuItems.get(itemNumber - 1);
    }
}
