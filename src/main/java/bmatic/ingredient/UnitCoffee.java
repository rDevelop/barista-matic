package bmatic.ingredient;

/**
 * Specific ingredient and cost.
 */
public class UnitCoffee extends Ingredient {
    public UnitCoffee() {
        setCost(.75);
    }

    public UnitCoffee(double cost) {
        setCost(cost);
    }
}
