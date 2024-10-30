package ch9;

import java.util.Iterator;

public class Waitress {
    Menu panCakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu panCakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> panCakeHouseMenuIterator = panCakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("1식당 메뉴");
        printMenu(panCakeHouseMenuIterator);
        System.out.println("2식당 메뉴");
        printMenu(dinerMenuIterator);
        System.out.println("3식당 메뉴");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println("메뉴 이름: " + menuItem.getName());
            System.out.println("메뉴 가격: " + menuItem.getPrice());
            System.out.println("메뉴 설명: " + menuItem.getDescription());
        }
    }
}
