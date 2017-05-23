package bmatic.ingredient;

/**
 * All ingredients will inherit this class and all they'll do is set the cost.
 */
public abstract class Ingredient {
    private double cost;

    public double getCost() {
        return cost;
    }

    protected void setCost(double cost) {
        this.cost = cost;
    }
}
