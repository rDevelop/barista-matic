package bmatic.beverages;

import bmatic.ingredient.Ingredient;
import bmatic.ingredient.UnitCoffee;
import bmatic.ingredient.UnitCream;
import bmatic.ingredient.UnitSugar;

import java.util.HashMap;
import java.util.Map;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class Coffee extends Drink {
    public Coffee() {
        setDescription("Coffee");
        setCoffee(3);
        setSugar(1);
        setCream(1);
        Map<Ingredient, Integer> ingredients = new HashMap<>();

        ingredients.put(new UnitCoffee(), getCoffee());
        ingredients.put(new UnitSugar(), getSugar());
        ingredients.put(new UnitCream(), getCream());
        setIngredients(ingredients);
    }
}
