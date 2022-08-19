import java.util.Random;

public class Thermometer {

	 public int getTemperature() {
		 Random r = new Random();
		 int min = 0;
		 int max = 108;
		 int result = r.nextInt(max-min) + min;
		 return result;
	 }
	 
}
