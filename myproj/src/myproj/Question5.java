package myproj;

import java.util.HashMap;

public class Question5 {

	public static void main(String[] args) {

		String s="abcabcbb";
		System.out.println("Length of Longest Substring: "+lenOfLongestSubstring(s));
	}

	private static int lenOfLongestSubstring(String s) {
		if(s.length()<=1) {
			return s.length();
			
		}
		int longest=0;
		HashMap<Character,Integer> seenChar=new HashMap<>();
		int left=0,right=0;
		for(right=0;right<s.length();right++) {
			char currChar=s.charAt(right);
			if(seenChar.containsKey(currChar)) { 
			int prevSeenChar=seenChar.get(currChar);
			if(prevSeenChar>=left) {
				left=prevSeenChar+1;
			}
			}else {
			seenChar.put(currChar, right);
			}
			
		longest=Math.max(longest, right-left+1);
		}
	//	System.out.println("Left Index: "+left+" and Right index: "+ right);
		return longest;
		
	}

}
