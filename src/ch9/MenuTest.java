package ch9;

import java.util.List;

public class MenuTest {
    public static void main(String[] args) {
        Menu cakeMenu = new PanCakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(cakeMenu, dinerMenu);
        waitress.printMenu();
    }
}
