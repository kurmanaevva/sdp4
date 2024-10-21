package assignment2;

public class WeatherData {
    private WeatherStation weatherStation;

    public WeatherData(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void newWeatherData(float temperature, float humidity, float pressure) {
        weatherStation.setWeatherData(temperature, humidity, pressure);
    }
}