package bmatic.beverages;

import bmatic.ingredient.Ingredient;
import bmatic.inventory.InventoryItems;

import java.util.HashMap;
import java.util.Map;

/**
 * Abstract class that will be inherited by all drinks.
 * The only thing a concrete drink will need to define is the description and ingredients.
 * All drinks will use the same methods to get description, cost, and output
 */
public abstract class Drink extends InventoryItems {
    private Map<Ingredient, Integer> ingredients;
    private String description;

    Drink() {
        ingredients = new HashMap<>();
        description = "Plain drink";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Ingredient, Integer> ingredients) {
        this.ingredients = ingredients;
    }


    /**
     * The concrete class sets the ingredients
     * The getCost method iterates through the ingredients and then
     * iterates the number of units accumulating the cost from the drink object.
     *
     * @return cost of drink
     */
    protected double getCost() {
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
