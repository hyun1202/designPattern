package ch9;

public class MenuTest {
    public static void main(String[] args) {
        Menu cakeMenu = new PanCakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(cakeMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
