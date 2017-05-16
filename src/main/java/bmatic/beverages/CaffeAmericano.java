package bmatic.beverages;

import bmatic.ingredient.UnitEspresso;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class CaffeAmericano extends Drink {
    public CaffeAmericano() {
        description = "Caffe Americano";
        espresso = 3;
        ingredients.put(new UnitEspresso(), espresso);
    }
}