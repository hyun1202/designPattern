package ch4.pizza.store;

import ch4.pizza.ChicagoCheesePizza;
import ch4.pizza.Pizza;
import ch4.pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        }
        return pizza;
    }
}
