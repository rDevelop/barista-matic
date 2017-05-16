package bmatic;

import bmatic.baristaville.BaristaMatic;
import bmatic.beverages.*;
import bmatic.menu.BaristaMenu;
import org.junit.Test;

/**
 * Testing functionality of methods and functionality in BaristaMatic.
 */
public class BaristavilleTest {
    @Test
    public void drinkDescriptionTest() {
        assert (new CaffeAmericano().getDescription().contains("Cafe Americano"));
        assert (new CaffeLatte().getDescription().contains("Caffe Latte"));
        assert (new CaffeMocha().getDescription().contains("Caffe Mocha"));
        assert (new Cappuccino().getDescription().contains("Cappuccino"));
        assert (new Coffee().getDescription().contains("Coffee"));
        assert (new DecafCoffee().getDescription().contains("Decaf Coffee"));
        // coffee isn't contain chocolate milk
        assert (!new Coffee().getDescription().contains("Chocolate Milk"));
    }

    @Test
    public void getOrderTest() {
        BaristaMenu menu = new BaristaMenu();
        for (int i = 1; i <= menu.getNumItems(); i++) {
            assert (menu.getItem(i).getDrink() instanceof Drink);
            if (i == 3) {
                assert (menu.getItem(i).getDrink() instanceof CaffeMocha);
            }
        }
    }

    @Test
    public void isStockedTest() {
        BaristaMatic baristaMachine = new BaristaMatic();
        Coffee coffee = new Coffee();
        assert (baristaMachine.isStocked(coffee));

        baristaMachine.updateInventory(coffee);
        baristaMachine.updateInventory(coffee);
        baristaMachine.updateInventory(coffee);
        assert (!baristaMachine.isStocked(coffee));
    }

    @Test
    public void dispenseDrinkTest() {
        DecafCoffee decaf = new DecafCoffee();
        BaristaMatic baristaMachine = new BaristaMatic();

        baristaMachine.dispenseDrink(decaf);
        baristaMachine.updateInventory(decaf);

        baristaMachine.dispenseDrink(decaf);
        baristaMachine.updateInventory(decaf);

        baristaMachine.dispenseDrink(decaf);
        baristaMachine.updateInventory(decaf);
        assert (!baristaMachine.isStocked(decaf));
        assert (baristaMachine.isStocked(new Coffee()));

    }
}
