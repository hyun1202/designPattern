package ch4.pizza.store;

import ch4.pizza.ChicagoCheesePizza;
import ch4.pizza.Pizza;
import ch4.pizza.PizzaStore;
import ch4.pizza.ingredient.factory.ChicagoPizzaIngredientFactory;
import ch4.pizza.ingredient.factory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        // 재료 생성
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza(ingredientFactory);
        }
        return pizza;
    }
}
