package ch4.pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "시카고 치즈";
        dough = "두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("모짜렐라 치즈");
    }

    @Override
    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
