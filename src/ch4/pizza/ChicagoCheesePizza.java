package ch4.pizza;

import ch4.pizza.ingredient.factory.PizzaIngredientFactory;

public class ChicagoCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "시카고 치즈 피자";
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("준비 중:" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createChesse();
        clam = ingredientFactory.createClam();
    }

    @Override
    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
