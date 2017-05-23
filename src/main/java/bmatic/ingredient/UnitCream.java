package bmatic.ingredient;

/**
 * Specific ingredient and cost.
 */
public class UnitCream extends Ingredient {
    public UnitCream() {
        setCost(.25);
    }

    public UnitCream(double cost) {
        setCost(cost);
    }
}
