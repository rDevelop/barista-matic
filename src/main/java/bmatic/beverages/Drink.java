package bmatic.beverages;

import bmatic.ingredient.Ingredient;
import bmatic.inventory.InventoryItems;

import java.util.HashMap;
import java.util.Map;

/**
 * Abstract class that all drinks will be inherited by all drinks.
 * The only thing a drink will need to define is the description and ingredients.
 * All drinks will use the same methods to get description, cost, and output
 */
public abstract class Drink extends InventoryItems {
    public Map<Ingredient, Integer> ingredients;
    public String description;

    protected Drink() {
        ingredients = new HashMap<>();
        description = "Plain drink";
    }

    public String getDescription() {
        return description;
    }

    /**
     * The concrete class sets the ingredients
     * The getCost method iterates through the ingredients and then
     * iterates the number of units accumulating the cost from the drink object.
     * @return cost of drink
     */
    public double getCost() {
        double cost = 0;
        for (Map.Entry<Ingredient, Integer> entry : ingredients.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                cost += entry.getKey().getCost();
            }
        }
        return cost;
    }

    @Override
    public String toString() {
        return getDescription() + "," + String.format("$%.2f", getCost());
    }

}
