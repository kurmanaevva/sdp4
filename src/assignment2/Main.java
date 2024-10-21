package assignment2;

public class Main {
    public static void main(String[] args) {
        // Create a weather station
        WeatherStation weatherStation = new WeatherStation();

        // Create different displays and register them with the weather station
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.addObserver(forecastDisplay);

        // Simulate new weather data
        WeatherData weatherData = new WeatherData(weatherStation);
        weatherData.newWeatherData(28.0f, 65.0f, 30.4f);
        weatherData.newWeatherData(29.0f, 70.0f, 29.2f);
        weatherData.newWeatherData(26.5f, 90.0f, 29.9f);
    }
}