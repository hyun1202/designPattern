package ch5;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonClient {
    public static void main(String[] args) throws Exception {
        ESingleton instance = ESingleton.INSTANCE;
        System.out.println(instance.getValue());

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        // true
        System.out.println(singleton1 == singleton2);

        String fileName = "serializeTest";

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
        // false -> true로 변경
        System.out.println(singleton1 == singleton3);

        // 리플렉션은 class로는 방어하지 못한다.
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        // 생성자가 private 이므로 외부에서 access할 수 있도록 설정
        constructor.setAccessible(true);

        // 가져온 생성자를 통해 인스턴스화
        Singleton singleton4 = constructor.newInstance();

        System.out.println(singleton1);
        System.out.println(singleton4);
        // false
        System.out.println(singleton1 == singleton4);
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
