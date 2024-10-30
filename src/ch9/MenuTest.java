package ch9;

import java.util.List;

public class MenuTest {
    public static void main(String[] args) {
        PanCakeHouseMenu cakeMenu = new PanCakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(cakeMenu, dinerMenu);
        waitress.printMenu();
    }
}
