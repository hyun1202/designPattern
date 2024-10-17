package ch4.pizza.ingredient.factory;

import ch4.pizza.ingredient.*;

/*
    각 피자마다 사용하는 재료를 생상하는 클래스
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createChesse();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
