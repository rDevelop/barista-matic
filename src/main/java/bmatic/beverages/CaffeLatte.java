package bmatic.beverages;

import bmatic.ingredient.UnitEspresso;
import bmatic.ingredient.UnitSteamedMilk;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class CaffeLatte extends Drink {
    public CaffeLatte() {
        description = "Caffe Latte";
        espresso = 2;
        steamedMilk = 1;
        ingredients.put(new UnitEspresso(), espresso);
        ingredients.put(new UnitSteamedMilk(), steamedMilk);
    }
}
