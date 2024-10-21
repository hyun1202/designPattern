package ch5;

public class Singleton {
    // volatile 키워드를 사용
    // cache에 저장된 값이 아닌 Main Memory에서 읽어온다.
    private volatile static Singleton instance;

    private Singleton() {

    }

    // 3. Double-Checked Locking 사용
    // 인스턴스가 생성되어있는지 확인 후 생성되어 있지 않으면 동기화
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
