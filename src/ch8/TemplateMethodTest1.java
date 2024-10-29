package ch8;

public class TemplateMethodTest1 {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
