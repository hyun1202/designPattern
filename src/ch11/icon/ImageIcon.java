package ch11.icon;

import java.net.URL;

public class ImageIcon implements Icon {
    URL imageUrl;
    String coverName;

    public ImageIcon(URL imageUrl, String coverName) {
        this.imageUrl = imageUrl;
        this.coverName = coverName;
    }

    @Override
    public int getIconWidth() {
        return 100;
    }

    @Override
    public int getIconHeight() {
        return 100;
    }

    @Override
    public void paintIcon() {
        System.out.println("실제 아이콘 불러오기");
    }
}
