package bmatic.beverages;

import bmatic.ingredient.Ingredient;
import bmatic.ingredient.UnitEspresso;

import java.util.HashMap;
import java.util.Map;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class CaffeAmericano extends Drink {

    public CaffeAmericano() {
        setDescription("Caffe Americano");
        setEspresso(3);
        Map<Ingredient, Integer> ingredients = new HashMap<>();
        ingredients.put(new UnitEspresso(), getEspresso());
        setIngredients(ingredients);
    }
}