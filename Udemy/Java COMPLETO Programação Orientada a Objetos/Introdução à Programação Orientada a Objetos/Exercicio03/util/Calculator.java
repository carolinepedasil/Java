package util;

public class Calculator {
	
	public static double PI = 3.14; //final significa que é uma CONSTANTE
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
