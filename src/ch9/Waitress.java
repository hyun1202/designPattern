package ch9;

import java.util.Iterator;

public class Waitress {
    Menu panCakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu panCakeHouseMenu, Menu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> panCakeHouseMenuIterator = panCakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("1식당 메뉴");
        printMenu(panCakeHouseMenuIterator);
        System.out.println("2식당 메뉴");
        printMenu(dinerMenuIterator);
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
