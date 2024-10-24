package ch7.facade;

public class HomeTheaterFacade {
    Screen screen;
    Projector projector;

    public HomeTheaterFacade(Screen screen, Projector projector) {
        this.screen = screen;
        this.projector = projector;
    }

    public void watchMovie() {
        screen.up();
        projector.on();
    }

    public void endMovie() {
        screen.down();
        projector.off();
    }
}
