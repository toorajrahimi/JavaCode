package JavaCodes;

public class Enum {

	enum games {
		PUBG, ASSASINSCREED, FORTNITE;
	}
	
	public static void main(String[] args) {
		
		games gam = games.PUBG;
		if(gam== gam.PUBG) {
			System.out.println("it is pubg");
		}else if(gam==gam.ASSASINSCREED) {
			System.out.println("it is ASSASINSCREED");
		}else if(gam==gam.FORTNITE) {
			System.out.println("it is FORTNITE");
		}
		

	}

}
