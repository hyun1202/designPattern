package ch2.weatherMonitoring.observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}