package JavaCodes;

public class Shirt {
	
	public static String Color;
	public static char Size;
	Shirt() {}
	
	Shirt(String newColor, char newSize) {
		Color = newColor;
		Size = newSize;
	}
	
	public static void putOn() {
		System.out.println("shirt is on!");
	}
	
	public static void takeOff() {
		System.out.println("shirt is off!");
	}
	
	public static void setColor(String newColor) {
		Color = newColor;
	}
	
	public static void setSize(char newSize) {
		Size = newSize;
	}
}
