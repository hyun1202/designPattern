package ch6.remoteController.macro;

import ch6.remoteController.Command;

/*
    여러 동작을 한 번에 처리하기 위해 여러 커맨드를 실행하는 클래스
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
