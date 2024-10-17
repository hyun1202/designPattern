package ch4.pizza;

public class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        // 팩토리에서 생산하는 제품에 해당하는 클래스는
        // 각 인터페이스를 구현해야하며 구상 클래스여야 한다.
        Pizza pizza = factory.createPizza(type);

        // 피자 만들기
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
