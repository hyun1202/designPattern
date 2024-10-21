package ch5;

import java.io.Serializable;

/*
    클래스로 생성하게 되면 리플렉션, 직렬화, 역직렬화 문제가 있다.
    1. 리플렉션은 private로 지정해도 접근이 가능해 new 연산자로 인스턴스 생성이 가능해 싱글톤이 깨진다.
    2. 직렬화 후 역직렬화 시 싱글톤이 깨지게 된다.
 */
public class Singleton implements Serializable {
    // volatile 키워드를 사용
    // cache에 저장된 값이 아닌 Main Memory에서 읽어온다.
    private volatile static Singleton instance;
    // 인스턴스의 직렬화 결과에는 데이터를 가질 이유가 없으므로 인스턴스 필드를 transient로 선언
    // transient: 직렬화 과정에서 제외
    transient String name = "";

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

    private Object readResolve() {
        return instance;
    }
}
