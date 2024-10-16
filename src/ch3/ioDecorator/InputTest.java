package ch3.ioDecorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            FileInputStream fs = new FileInputStream("test.txt");
            // 소문자 변환 데코레이터로 감싸준다.
            InputStream in = new LowerCaseInputStream( new BufferedInputStream(fs));

            System.out.println("소문자 변환 데코레이터 적용");

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
