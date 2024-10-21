package assignment2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> displays;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        displays = new ArrayList<>();
    }

    public void addObserver(WeatherDisplay display) {
        displays.add(display);
    }

    public void removeObserver(WeatherDisplay display) {
        displays.remove(display);
    }

    public void notifyObservers() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}