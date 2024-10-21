package ch5;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    // 1. 멀티 스레딩 문제 해결 - 동기화 사용
    // 단점: 성능 저하
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
