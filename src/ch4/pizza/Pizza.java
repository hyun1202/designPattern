package ch4.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println(name + "피자 준비");
        System.out.println("도우 돌리기");
        System.out.println("소스 뿌리기");
        System.out.print("토핑 올리기:");
        for (String topping : toppings) {
            System.out.print(" " + topping);
        }
        System.out.println();
    }
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