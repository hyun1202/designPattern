package ch2.weatherMonitoring;

public class WeatherData {

    public float getTemperature() {
        System.out.println("온도");
        return 30;
    }

    public float getHumidity() {
        System.out.println("습도");
        return 50;
    }

    public float getPressure() {
        System.out.println("기압");
        return 1007.3f;
    }

    /**
     * 갱신된 값을 가져올 때마다 이 메소드 호출됨
     */
    void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // 디스플레이 업데이트하는 코드 작성

        // 프로그램을 고치지 않고는 다른 디스플레이 항목을 추가하거나 제거할 수 없음
        // 바뀔 수 있는 부분이다 = 캡슐화
//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay.update(temp, humidity, pressure);
    }
}
