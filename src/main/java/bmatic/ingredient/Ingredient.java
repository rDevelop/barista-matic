package bmatic.ingredient;

/**
 * All ingredients will inherit this class and all they'll do is set the cost.
 */
public abstract class Ingredient {
    public double cost;

    public double getCost() {
        return cost;
    }
}
