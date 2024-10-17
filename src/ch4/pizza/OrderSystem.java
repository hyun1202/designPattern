package ch4.pizza;

public class OrderSystem {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = new PizzaStore(factory).orderPizza("cheese");

        pizza = new PizzaStore(factory).orderPizza("veggie");
    }
}
