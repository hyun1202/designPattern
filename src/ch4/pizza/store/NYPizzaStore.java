package ch4.pizza.store;

import ch4.pizza.NYCheesePizza;
import ch4.pizza.Pizza;
import ch4.pizza.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        }
        return pizza;
    }
}
