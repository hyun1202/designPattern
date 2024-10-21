package ch6.remoteController;

/*
    커맨드 객체는 모두 같은 인터페이스를 구현해야한다.
    메소드는 하나이다.
 */
public interface Command {
    void execute();
}
