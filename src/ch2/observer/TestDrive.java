package ch2.observer;

import org.junit.Test;

public class TestDrive {
	@Test
	public void testObserver() {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(32, 56, 98);
		weatherData.setMeasurements(35, 86, 68);
	}
}
