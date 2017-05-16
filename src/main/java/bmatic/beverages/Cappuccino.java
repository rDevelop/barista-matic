package bmatic.beverages;

import bmatic.ingredient.UnitEspresso;
import bmatic.ingredient.UnitFoamedMilk;
import bmatic.ingredient.UnitSteamedMilk;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class Cappuccino extends Drink {
    public Cappuccino() {
        description = "Cappuccino";
        espresso = 2;
        steamedMilk = 1;
        foamedMilk = 1;
        ingredients.put(new UnitEspresso(), espresso);
        ingredients.put(new UnitSteamedMilk(), steamedMilk);
        ingredients.put(new UnitFoamedMilk(), foamedMilk);
    }
}
