package bmatic.inventory;

/**
 * All available items available in the Barista-Matic
 * Default to zero values and returns values in getter methods.
 */
public abstract class InventoryItems {
    private int cocoa = 0;
    private int coffee = 0;
    private int cream = 0;
    private int decafCoffee = 0;
    private int espresso = 0;
    private int foamedMilk = 0;
    private int steamedMilk = 0;
    private int sugar = 0;
    private int whippedCream = 0;

    public int getCocoa() {
        return cocoa;
    }

    public void setCocoa(int cocoa) {
        this.cocoa = cocoa;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCream() {
        return cream;
    }

    public void setCream(int cream) {
        this.cream = cream;
    }

    public int getDecafCoffee() {
        return decafCoffee;
    }

    public void setDecafCoffee(int decafCoffee) {
        this.decafCoffee = decafCoffee;
    }

    public int getEspresso() {
        return espresso;
    }

    public void setEspresso(int espresso) {
        this.espresso = espresso;
    }

    public int getFoamedMilk() {
        return foamedMilk;
    }

    public void setFoamedMilk(int foamedMilk) {
        this.foamedMilk = foamedMilk;
    }

    public int getSteamedMilk() {
        return steamedMilk;
    }

    public void setSteamedMilk(int steamedMilk) {
        this.steamedMilk = steamedMilk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(int whippedCream) {
        this.whippedCream = whippedCream;
    }
}
