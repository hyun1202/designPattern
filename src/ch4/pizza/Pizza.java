package ch4.pizza;

import ch4.pizza.ingredient.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("피자 굽기");
    }
    void cut() {
        System.out.println("피자 자르기");
    }
    void box() {
        System.out.println("피자 포장하기");
    }
}