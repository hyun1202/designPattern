package ch5;

public class Singleton {
    // 2. 처음부터 인스턴스 생성
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
