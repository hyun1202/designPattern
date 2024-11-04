package ch11.icon;

import java.net.URL;

public class ImageIconTest {
    public static void main(String[] args) throws Exception {
        ImageProxy imageProxy = new ImageProxy(new URL("http://127.0.0.1/path"));
        System.out.println(imageProxy.getIconHeight());
        imageProxy.paintIcon();
        Thread.sleep(1);
        System.out.println(imageProxy.getIconHeight());
    }
}
