package JavaCodes;

enum names {
	JACKSON, KINGKONG, GYPSE; 
}

public class Enums {

	public static void main(String[] args) {
		
		names n = names.GYPSE;
		
		switch(n) {
		case KINGKONG:
			System.out.println("KINGKONG");
			break;
			
		case JACKSON:
			System.out.println("JACKSON");
			break;
			
		case GYPSE: 
			System.out.println("GYPSE");
			break;
		}
		
	}

}
