package ch5;

import java.io.*;

public class SingletonClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ESingleton instance = ESingleton.INSTANCE;
        System.out.println(instance.getValue());

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        // true
        System.out.println(singleton1 == singleton2);

        String fileName = "singleton";

        // 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        out.writeObject(singleton1);
        out.close();

        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
        // 역직렬화 시에 인스턴스를 다시 만들게 된다.
        Singleton singleton3 = (Singleton) in.readObject();
        in.close();

        System.out.println(singleton1);
        System.out.println(singleton3);
        // false
        System.out.println(singleton1 == singleton3);
    }
}

// 4. Enum을 이용한 싱글톤
// 동기화, 클래스 로딩 문제, 리플렉션, 직렬화, 역직렬화 문제 해결 가능
enum ESingleton {
    INSTANCE;
    int value = 2;

    public int getValue() {
        return value;
    }
}
