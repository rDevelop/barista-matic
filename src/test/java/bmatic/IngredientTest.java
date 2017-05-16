package bmatic;

import bmatic.ingredient.UnitSugar;
import org.junit.Test;

/**
 * Created by rob on 5/16/17.
 */
public class IngredientTest {
    @Test
    public void sugarCost() {
        assert(new UnitSugar().getCost() == .25);
    }
}
