package ch8;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("우유와 설탕 추가");
    }

    @Override
    boolean customerWantsCondiments() {
        System.out.print("설탕과 우유를 넣을까요?(y/n)");
        String answer = new Scanner(System.in).next();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
}
