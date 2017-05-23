package bmatic.ingredient;

/**
 * Specific ingredient and cost.
 */
public class UnitEspresso extends Ingredient {
    public UnitEspresso() {
        setCost(1.1);
    }

    public UnitEspresso(double cost) {
        setCost(cost);
    }
}
