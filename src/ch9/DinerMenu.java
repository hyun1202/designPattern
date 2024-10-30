package ch9;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int menuIndex;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식 주의자용 BLT",
                "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴",
                true,
                2.99);
        addItem("BLT",
                "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",
                false,
                2.99);
        addItem("핫도그",
                "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그",
                false,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (menuIndex >= MAX_ITEMS) {
            System.out.println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        } else {
            menuItems[menuIndex++] = menuItem;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
