package ch8;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("우유와 설탕 추가");
    }
}
