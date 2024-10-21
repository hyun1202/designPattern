package ch5;

public class SingletonClient {
    public static void main(String[] args) {
        ESingleton instance = ESingleton.INSTANCE;
        System.out.println(instance.getValue());
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
