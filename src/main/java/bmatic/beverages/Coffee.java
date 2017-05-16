package bmatic.beverages;

import bmatic.ingredient.UnitCoffee;
import bmatic.ingredient.UnitCream;
import bmatic.ingredient.UnitSugar;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class Coffee extends Drink {
    public Coffee() {
        description = "Coffee";
        coffee = 3;
        sugar = 1;
        cream = 1;
        ingredients.put(new UnitCoffee(), coffee);
        ingredients.put(new UnitSugar(), sugar);
        ingredients.put(new UnitCream(), cream);
    }
}
