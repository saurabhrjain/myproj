package practiceSet;

public class Memoization {

	public static void main(String[] args) {
		String s="great";
		String t="rgeat";
		//long=Integer.
		System.out.println(s.substring(0,1) + " " + t.substring(0,1) );
		System.out.println(s.substring(1) + " " + t.substring(1) );
		System.out.println(s.substring(0,1) + " " + t.substring(4) );
		System.out.println(s.substring(1) + " " + t.substring(0,4) );

	}

}
