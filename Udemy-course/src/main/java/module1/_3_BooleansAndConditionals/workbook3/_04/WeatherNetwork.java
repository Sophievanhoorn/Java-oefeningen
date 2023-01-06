package module1._3_BooleansAndConditionals.workbook3._04;

import java.util.Iterator;

public class WeatherNetwork {
	public static void main(String[] args) {

		// See Learn the Part for the complete instructions (link in resources folder of
		// Udemy video).

		// Update the forecast variable based on the temperature.

		int temp = -12;

		String forecast;

		if(temp <= -1) {
			forecast = "The forecast is FREEZING! Stay home!";
		}else if(temp <= 10) {
			forecast ="The forecast is Chilly. Wear a coat!";
		}else {
			forecast = "It's warm. Go outside!";
		}

		System.out.println(forecast);
	}
}
