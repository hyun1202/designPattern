package ch11.icon;

import java.net.URL;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            System.out.println("실제 객체");
            return imageIcon.getIconHeight();
        }
        return 600;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon() {
        if (imageIcon != null) {
            imageIcon.paintIcon();
            return;
        }
        System.out.println("앨범 커버를 불러오는 중입니다.");
        if (!retrieving) {
            retrieving = true;

            retrievalThread = new Thread(() -> {
                try {
                    // 실제 이미지를 로딩한다.
                    setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            retrievalThread.start();
        }
    }
}
