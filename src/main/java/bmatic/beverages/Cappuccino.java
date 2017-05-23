package bmatic.beverages;

import bmatic.ingredient.Ingredient;
import bmatic.ingredient.UnitEspresso;
import bmatic.ingredient.UnitFoamedMilk;
import bmatic.ingredient.UnitSteamedMilk;

import java.util.HashMap;
import java.util.Map;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class Cappuccino extends Drink {
    public Cappuccino() {
        setDescription("Cappuccino");
        setEspresso(2);
        setSteamedMilk(1);
        setFoamedMilk(1);
        Map<Ingredient, Integer> ingredients = new HashMap<>();

        ingredients.put(new UnitEspresso(), getEspresso());
        ingredients.put(new UnitSteamedMilk(), getSteamedMilk());
        ingredients.put(new UnitFoamedMilk(), getFoamedMilk());
        setIngredients(ingredients);
    }
}
