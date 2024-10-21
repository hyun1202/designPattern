package ch6.remoteController;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand");
    }
}
