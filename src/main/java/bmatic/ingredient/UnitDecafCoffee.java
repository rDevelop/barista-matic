package bmatic.ingredient;

/**
 * Specific ingredient and cost.
 */
public class UnitDecafCoffee extends Ingredient {
    public UnitDecafCoffee() {
        setCost(.75);
    }

    public UnitDecafCoffee(double cost) {
        setCost(cost);
    }
}
