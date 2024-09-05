package ch2.weatherMonitoring;

import ch2.weatherMonitoring.observer.Observer;
import ch2.weatherMonitoring.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observers;
    float temp;
    float humidity;
    float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * 갱신된 값을 가져올 때마다 이 메소드 호출됨
     */
    void measurementsChanged() {
        // 디스플레이 업데이트하는 코드 작성

        // 프로그램을 고치지 않고는 다른 디스플레이 항목을 추가하거나 제거할 수 없음
        // 바뀔 수 있는 부분이다 = 캡슐화
//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay.update(temp, humidity, pressure);

        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
