package ch7.facade;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(screen, projector);
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
