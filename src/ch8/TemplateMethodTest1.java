package ch8;

public class TemplateMethodTest1 {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("\n 커피 준비");
        coffee.prepareRecipe();

        System.out.println("\n 홍차 준비");
        tea.prepareRecipe();

        System.out.println("\n 커피2 준비");
        CaffeineBeverage coffeeWithHook = new CoffeeWithHook();

        coffeeWithHook.prepareRecipe();
    }
}
