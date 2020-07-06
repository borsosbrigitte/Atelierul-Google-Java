//Borsos Brigitte GI1 EVH

package pizzaBase;

import java.awt.*;

public class PizzaIngredients implements Pizza {
    private Pizza pizza;

    public PizzaIngredients(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake(Graphics g) {
        pizza.bake(g);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }
}
