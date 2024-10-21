package ch6.remoteController;

/*
    제어할 기기를 연결할 슬롯과 버튼이 하나인 리모컨
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
