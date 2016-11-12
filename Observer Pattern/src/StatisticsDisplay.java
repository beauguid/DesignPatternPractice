

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
	}
	
	public void update(float temperature, float humidity, float pressure){
		numReadings++;
		this.tempSum += temperature;
		if(temperature > maxTemp){
			maxTemp = temperature;
		}
		if(temperature < minTemp){
			minTemp = temperature;
		}
		display();
	}
	
	
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
	
}
