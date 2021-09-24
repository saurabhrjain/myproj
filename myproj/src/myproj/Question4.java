package myproj;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc#d";
		String t="abzz##d";
		
		if(backSpaceComapre(s,t)) {
		System.out.println("Strings are Similar");
		}
		else {
			System.out.println("Strings are not Similar");
		}

	}

	private static boolean backSpaceComapre(String s, String t) {
		// TODO Auto-generated method stub
		int p1=s.length()-1;
		int p2=t.length()-1;
		while(p1>0||p2>0) {
			if(s.charAt(p1)=='#'||t.charAt(p2)=='#') {
				if(s.charAt(p1)=='#') {
					int backcount=2;
					while(backcount>0) {
						p1--;
						backcount--;
						if(s.charAt(p1)=='#') {
							backcount+=2;
						}
					}
				}
				if(t.charAt(p2)=='#') {
					int backcount=2;
					while(backcount>0) {
						p2--;
						backcount--;
						if(s.charAt(p2)=='#') {
							backcount+=2;
						}
					}
				}
			}else {
				if(s.charAt(p1)!=t.charAt(p2)) {
					return false;
				}else {
					p1--;p2--;
				}
			}
			
		}
	return true;	
	}

}
