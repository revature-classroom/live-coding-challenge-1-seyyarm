
public class WeatherMachine{
	
	Thermometer thermometer = new Thermometer();
	private int[] getPastTemperatures() {
		
		int[] arrayWeather = new int[24];
		for(int i = 0; i < 24; i++) {
			arrayWeather[i] = thermometer.getTemperature();
		}
		return arrayWeather;
	}
	
	public void	getWeatherReport() {
		int[] arrResult = getPastTemperatures();
		for(int i=0; i <24; i++) {
		System.out.println(i + ":00 " + arrResult[i]);
		}
	} 
}
