package bmatic.ingredient;

/**
 * Specific ingredient and cost.
 */
public class UnitSteamedMilk extends Ingredient {
    public UnitSteamedMilk() {

        setCost(.35);
    }

    public UnitSteamedMilk(double cost) {
        setCost(cost);
    }
}
