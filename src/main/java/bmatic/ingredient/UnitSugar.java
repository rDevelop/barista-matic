package bmatic.ingredient;

/**
 * Specific ingredient and cost.
 */
public class UnitSugar extends Ingredient {
    public UnitSugar() {
        setCost(.25);
    }

    public UnitSugar(double cost) {
        setCost(cost);
    }
}
