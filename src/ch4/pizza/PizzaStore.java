package ch4.pizza;

/*
    요구사항 변경:
      * 1. 프랜차이즈 사업 시작
       -> 각 지점마다 그 지역의 특성과 맛을 반영해야함
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        // 팩토리에서 생산하는 제품에 해당하는 클래스는
        // 각 인터페이스를 구현해야하며 구상 클래스여야 한다.
        Pizza pizza = createPizza(type);

        // 피자 만들기
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 인스턴스는 팩토리 메소드에서 처리 = 서브클래스가 처리
    abstract protected Pizza createPizza(String type);
}
