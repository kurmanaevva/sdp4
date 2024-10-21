package assignment2;

public class StatisticsDisplay implements WeatherDisplay {
    private float maxTemp = 0.0f;
    private float minTemp = 100.0f;
    private float tempSum = 0.0f;
    private int numReadings = 0;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}