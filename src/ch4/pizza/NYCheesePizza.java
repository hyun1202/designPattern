package ch4.pizza;

import ch4.pizza.ingredient.factory.PizzaIngredientFactory;

public class NYCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "뉴욕 치즈 피자";
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("준비 중:" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createChesse();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
