package myproj;

import java.util.HashMap;


public class assign1 {

	public static void main(String[] args) {
		
		//595782
		String	temp="";
		String no= "59578219";
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		for (int i =no.length()-1;i>=0;i--) {
			
			if(!hash.containsKey(no.charAt(i))) {
				hash.put(no.charAt(i),1);
				
				temp=temp+no.charAt(i);
			}
			
		}

		
		System.out.print(temp);
		
		
	}

}
