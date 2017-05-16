package bmatic.beverages;

import bmatic.ingredient.UnitCocoa;
import bmatic.ingredient.UnitEspresso;
import bmatic.ingredient.UnitSteamedMilk;
import bmatic.ingredient.UnitWhippedCream;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class CaffeMocha extends Drink {
    public CaffeMocha() {
        description = "Caffe Mocha";
        espresso = 1;
        cocoa = 1;
        steamedMilk = 1;
        whippedCream = 1;
        ingredients.put(new UnitEspresso(), espresso);
        ingredients.put(new UnitCocoa(), cocoa);
        ingredients.put(new UnitSteamedMilk(), steamedMilk);
        ingredients.put(new UnitWhippedCream(), whippedCream);

    }
}
