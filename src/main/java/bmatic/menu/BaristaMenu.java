package bmatic.menu;

import bmatic.beverages.*;

import java.util.ArrayList;
import java.util.List;

/**
 * A list of MenuItems initiated with item number.
 */
public class BaristaMenu {
    private List<MenuItem> menuItems;

    public BaristaMenu() {
        menuItems = new ArrayList<>();
    }

    /**
     * Create the default menu for the Barista
     */
    public BaristaMenu defaultMenu() {
        menuItems.add(0, new MenuItem(1, new CaffeAmericano()));
        menuItems.add(1, new MenuItem(2, new CaffeLatte()));
        menuItems.add(2, new MenuItem(3, new CaffeMocha()));
        menuItems.add(3, new MenuItem(4, new Cappuccino()));
        menuItems.add(4, new MenuItem(5, new Coffee()));
        menuItems.add(5, new MenuItem(6, new DecafCoffee()));
        return this;
    }


    public void addMenuItem(int index, Drink drink) {

        MenuItem menuItem = new MenuItem(index, drink);
        if (menuItems.size() > index - 1) {
            menuItems.set(index - 1, menuItem);
        } else {
            menuItems.add(index - 1, menuItem);
        }
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
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
        if (menuItems.size() >= itemNumber) {
            return menuItems.get(itemNumber - 1);
        }
        return null;
    }
}
