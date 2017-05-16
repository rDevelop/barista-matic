package bmatic;

import bmatic.beverages.Cappuccino;
import bmatic.beverages.Drink;
import bmatic.menu.BaristaMenu;
import bmatic.menu.MenuItem;
import org.junit.Test;

/**
 * Test the BaristaMenu
 */
public class MenuTest {
    @Test
    public void menuTest() {
        String menuOutput = "";
        BaristaMenu menu = new BaristaMenu();
        for (Object item : menu.getItems()) {
            MenuItem menuItem = (MenuItem) item;
            menuOutput += menuItem;
        }
        // contains
        assert (menuOutput.contains("1,Caffe Americano,$3.30"));
        assert (menuOutput.contains("2,Caffe Latte,$2.55"));
        assert (menuOutput.contains("3,Caffe Mocha,$3.35"));
        assert (menuOutput.contains("4,Cappuccino,$2.90"));
        assert (menuOutput.contains("5,Coffee,$2.75"));
        assert (menuOutput.contains("6,Decaf Coffee,$2.75"));
        // doesn't contain chocolate milk
        assert (!menuOutput.contains("Chocolate Milk,$2.00"));
    }

    @Test
    public void getDrinkTest() {
        BaristaMenu menu = new BaristaMenu();
        Drink drink = menu.getItem(4).getDrink();
        assert (drink instanceof Cappuccino);
        assert (drink.toString().contains("Cappuccino"));
    }

}
