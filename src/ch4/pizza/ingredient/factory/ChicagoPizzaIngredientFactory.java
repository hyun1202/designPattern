package ch4.pizza.ingredient.factory;

import ch4.pizza.ingredient.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createChesse() {
        return new MozzarellaChesse();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new BlackOllves()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SllcedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
