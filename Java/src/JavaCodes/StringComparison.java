package JavaCodes;

public class StringComparison {

	public static void main(String[] args) {
		
		String a1 = new String("lemur");
		String a11 = new String("lemurs");
		if(a1.equals(a11)) {
			System.out.println("true smart boy");
		} else {
			System.out.println("false you noob");
		}
		System.out.println("\n-------------------------------------");
		
		String S2 = new String("god gaming");
		String S3 = new String("god gaming");
		if(S2.equals(S3)) {
			System.out.println("true you good at game");
		} else {
			System.out.println("false you noob your brother better than you");
		}
		
		System.out.println("\n--------------------------------------------------");
		
		String n3 = new String("velocity 9");
		String n3v1 = new String("velocity9");
		if(n3.equals(n3v1)) {
			System.out.println("true you speedster");
		} else {
			System.out.println("false you slow boy");
		}
		
		System.out.println("\n--------------------------------------------------");
		
		String n = new String("true you smart");
		String b = new String("true you smart");
		if(n.equals(b)) {
			System.out.println("true you so smart");
		}else {
			System.out.println("fasle you not smart");
		}
		System.out.println("\n--------------------------------------------------");
		String b4 = new String("what is v3 +/- v2");
		String n4 = new String("what is v3 +'- v2");
		if(b4.equals(n4)) {
			System.out.println("true it equals 0");
		}else {
			System.out.println("false it is 0 ");
		}
		System.out.println("\n--------------------------------------------------");
		
		String h4 = new String("fast and furious the best");
		String j4 = new String("fast and furious the best");
		if(h4.equals(j4)) {
		System.out.println("true it is the best movie");
		}else {
			System.out.println("fasle it was a bad movie");
		}
		
		System.out.println("\n--------------------------------------------------");
		
		String k5 = new String("the action movies are the best");
		String jj4 = new String("the action movies are the besst");
		if(k5.equals(jj4)) {
		System.out.println("true it is the best movie");
		}else {
			System.out.println("fasle it was a bad movie");
		}
		
		System.out.println("\n--------------------------------------------------");
		
		
		String a6r= new String("king kong the movie");
		String o99 = new String("king kong the 0movie");
		if(a6r.equals(o99)) {
		System.out.println("true it is a movie");
		}else {
			System.out.println("fasle it not a movie");
		}
		
		System.out.println("\n--------------------------------------------------");
		
		
		String h4a = new String("criminal movies are the best");
		String j4l = new String("criminal movies are the best");
		if(h4a.equals(j4l)) {
		System.out.println("true it is the best movie");
		}else {
			System.out.println("fasle it was a bad movie");
		}
		
		System.out.println("\n--------------------------------------------------");
		
		
		String h4t = new String("songs are the best to hear");
		String j4k = new String("s0ngs are the best to hear");
		if(h4t.equals(j4k)) {
		System.out.println("true it is the best song");
		}else {
			System.out.println("fasle it was a bad movie");
		}
		
		System.out.println("\n--------------------------------------------------");
    }
}