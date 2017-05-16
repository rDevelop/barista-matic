package bmatic.inventory;

/**
 * All available items available in the Barista-Matic
 * Default to zero values and returns values in getter methods.
 */
public abstract class InventoryItems {
    protected int cocoa = 0;
    protected int coffee = 0;
    protected int cream = 0;
    protected int decafCoffee = 0;
    protected int espresso = 0;
    protected int foamedMilk = 0;
    protected int steamedMilk = 0;
    protected int sugar = 0;
    protected int whippedCream = 0;

    public int getCocoa() {
        return cocoa;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getCream() {
        return cream;
    }

    public int getDecafCoffee() {
        return decafCoffee;
    }

    public int getEspresso() {
        return espresso;
    }

    public int getFoamedMilk() {
        return foamedMilk;
    }

    public int getSteamedMilk() {
        return steamedMilk;
    }

    public int getSugar() {
        return sugar;
    }

    public int getWhippedCream() {
        return whippedCream;
    }
}
