package bmatic.inventory;

import bmatic.beverages.Drink;

/**
 * Inventory of all the items from the InventoryItems class.
 */
public class Inventory extends InventoryItems {

    public Inventory() {
        setDefaultInventory();
    }

    /**
     * Default inventory list.
     */
    private void setDefaultInventory() {
        setCocoa(10);
        setCoffee(10);
        setCream(10);
        setDecafCoffee(10);
        setEspresso(10);
        setFoamedMilk(10);
        setSteamedMilk(10);
        setSugar(10);
        setWhippedCream(10);
    }

    public void restock() {
        setDefaultInventory();
    }

    public void setCocoa(int cocoa) {
        this.cocoa = cocoa;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void setCream(int cream) {
        this.cream = cream;
    }

    public void setDecafCoffee(int decafCoffee) {
        this.decafCoffee = decafCoffee;
    }

    public void setEspresso(int espresso) {
        this.espresso = espresso;
    }

    public void setFoamedMilk(int foamedMilk) {
        this.foamedMilk = foamedMilk;
    }

    public void setSteamedMilk(int steamedMilk) {
        this.steamedMilk = steamedMilk;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setWhippedCream(int whippedCream) {
        this.whippedCream = whippedCream;
    }


    /**
     * Since we're using the Drink abstract class, we will update all
     * ingredients in the inventory list. The drink will be zero for
     * all ingredients except those defined in the implemented drink
     *
     * @param drink to update stock from.
     */
    public void updateStockFromDrink(Drink drink) {
        setCocoa(getCocoa() - drink.getCocoa());
        setCoffee(getCoffee() - drink.getCoffee());
        setCream(getCream() - drink.getCream());
        setDecafCoffee(getDecafCoffee() - drink.getDecafCoffee());
        setEspresso(getEspresso() - drink.getEspresso());
        setFoamedMilk(getFoamedMilk() - drink.getFoamedMilk());
        setSteamedMilk(getSteamedMilk() - drink.getSteamedMilk());
        setSugar(getSugar() - drink.getSugar());
        setWhippedCream(getWhippedCream() - drink.getWhippedCream());
    }

    /**
     * By using Drink abstract class we don't need to worry about which specific drink
     * we're looking for. We'll just check each ingredient in the inventory to the
     * drink's number of ingredients needed to make that drink.
     * All drink values will be zero except for those defined in the implemented drink.
     *
     * @param drink for stock check
     * @return true if stocked
     */
    public boolean isStockedForDrink(Drink drink) {
        if (getCocoa() < drink.getCocoa()) {
            return false;
        }
        if (getCoffee() < drink.getCoffee()) {
            return false;
        }
        if (getCream() < drink.getCream()) {
            return false;
        }
        if (getDecafCoffee() < drink.getDecafCoffee()) {
            return false;
        }
        if (getEspresso() < drink.getEspresso()) {
            return false;
        }
        if (getFoamedMilk() < drink.getFoamedMilk()) {
            return false;
        }
        if (getSteamedMilk() < drink.getSteamedMilk()) {
            return false;
        }
        if (getSugar() < drink.getSugar()) {
            return false;
        }
        if (getWhippedCream() < drink.getWhippedCream()) {
            return false;
        }
        return true;
    }

    /**
     * Create a string of the inventory items.
     *
     * @return inventory list
     */
    public String inventoryList() {
        StringBuilder buffer = new StringBuilder("Inventory:\n");
        buffer.append("Cocoa," + cocoa + "\n");
        buffer.append("Coffee," + coffee + "\n");
        buffer.append("Cream," + cream + "\n");
        buffer.append("Decaf Coffee," + decafCoffee + "\n");
        buffer.append("Espresso," + espresso + "\n");
        buffer.append("Foamed Milk," + foamedMilk + "\n");
        buffer.append("Steamed Milk," + steamedMilk + "\n");
        buffer.append("Sugar," + sugar + "\n");
        buffer.append("Whipped Cream," + whippedCream);
        return buffer.toString();
    }
}