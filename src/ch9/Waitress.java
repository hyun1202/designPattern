package ch9;

public class Waitress {
    PanCakeHouseMenu panCakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinerMenu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator panCakeHouseMenuIterator = panCakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("1식당 메뉴");
        printMenu(panCakeHouseMenuIterator);
        System.out.println("2식당 메뉴");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println("메뉴 이름: " + menuItem.getName());
            System.out.println("메뉴 가격: " + menuItem.getPrice());
            System.out.println("메뉴 설명: " + menuItem.getDescription());
        }
    }
}
