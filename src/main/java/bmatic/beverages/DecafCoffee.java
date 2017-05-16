package bmatic.beverages;

import bmatic.ingredient.UnitCream;
import bmatic.ingredient.UnitDecafCoffee;
import bmatic.ingredient.UnitSugar;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class DecafCoffee extends Drink {
    public DecafCoffee() {
        description = "Decaf Coffee";
        decafCoffee = 3;
        sugar = 1;
        cream = 1;
        ingredients.put(new UnitDecafCoffee(), decafCoffee);
        ingredients.put(new UnitSugar(), sugar);
        ingredients.put(new UnitCream(), cream);
    }
}
