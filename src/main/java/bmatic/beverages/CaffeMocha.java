package bmatic.beverages;

import bmatic.ingredient.*;

import java.util.HashMap;
import java.util.Map;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class CaffeMocha extends Drink {
    public CaffeMocha() {
        setDescription("Caffe Mocha");
        setEspresso(1);
        setCocoa(1);
        setSteamedMilk(1);
        setWhippedCream(1);

        Map<Ingredient, Integer> ingredients = new HashMap<>();
        ingredients.put(new UnitEspresso(), getEspresso());
        ingredients.put(new UnitCocoa(), getCocoa());
        ingredients.put(new UnitSteamedMilk(), getSteamedMilk());
        ingredients.put(new UnitWhippedCream(), getWhippedCream());
        setIngredients(ingredients);

    }
}
