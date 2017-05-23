package bmatic.beverages;

import bmatic.ingredient.Ingredient;
import bmatic.ingredient.UnitEspresso;
import bmatic.ingredient.UnitSteamedMilk;

import java.util.HashMap;
import java.util.Map;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class CaffeLatte extends Drink {
    public CaffeLatte() {
        setDescription("Caffe Latte");
        Map<Ingredient, Integer> ingredients = new HashMap<>();
        setEspresso(2);
        setSteamedMilk(1);
        ingredients.put(new UnitEspresso(), getEspresso());
        ingredients.put(new UnitSteamedMilk(), getSteamedMilk());
        setIngredients(ingredients);

    }
}
