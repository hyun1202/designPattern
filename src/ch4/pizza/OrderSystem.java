package ch4.pizza;

import ch4.pizza.store.ChicagoPizzaStore;
import ch4.pizza.store.NYPizzaStore;

public class OrderSystem {
    public static void main(String[] args) {
        Pizza NYPizza = new NYPizzaStore().orderPizza("cheese");
        System.out.println();
        Pizza ChicagoPizza = new ChicagoPizzaStore().orderPizza("cheese");
    }
}
