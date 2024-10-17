package ch4.pizza.store;

import ch4.pizza.NYCheesePizza;
import ch4.pizza.Pizza;
import ch4.pizza.PizzaStore;
import ch4.pizza.ingredient.factory.NYPizzaIngredientFactory;
import ch4.pizza.ingredient.factory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        // 재료 생성
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza(ingredientFactory);
        }
        return pizza;
    }
}
