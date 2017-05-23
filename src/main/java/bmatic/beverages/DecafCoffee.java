package bmatic.beverages;

import bmatic.ingredient.Ingredient;
import bmatic.ingredient.UnitCream;
import bmatic.ingredient.UnitDecafCoffee;
import bmatic.ingredient.UnitSugar;

import java.util.HashMap;
import java.util.Map;

/**
 * A Specific drink and it's description and ingredient list.
 */
public class DecafCoffee extends Drink {

    public DecafCoffee() {
        setDescription("Decaf Coffee");
        setDecafCoffee(3);
        setSugar(1);
        setCream(1);
        Map<Ingredient, Integer> ingredients = new HashMap<>();
        ingredients.put(new UnitDecafCoffee(), getDecafCoffee());
        ingredients.put(new UnitSugar(), getSugar());
        ingredients.put(new UnitCream(), getCream());
        setIngredients(ingredients);
    }

}
