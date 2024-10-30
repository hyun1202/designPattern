package ch9;

import java.util.List;

public class MenuTest {
    public static void main(String[] args) {
        PanCakeHouseMenu cakeMenu = new PanCakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        List<MenuItem> cakeMenuList = cakeMenu.getMenuItems();
        MenuItem[] menuItems = dinerMenu.getMenuItems();

        // 메뉴 합병으로 인해 데이터를 꺼낼 때 여러개의 반복문이 필요해짐
        System.out.println("메뉴1 객체 데이터 꺼내기");
        for (MenuItem item : cakeMenuList) {
            System.out.println(item.name);
        }

        System.out.println("메뉴2 객체 데이터 꺼내기");
        for (MenuItem item : menuItems) {
            System.out.println(item.name);
        }
    }
}
