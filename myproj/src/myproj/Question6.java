package myproj;

public class Question6 {

	public static void main(String[] args) {
	String s="A man, a plan, a canal:Panama";
	s=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	
	System.out.print(isAlmostAPalindrome(s));
	
	}

	private static boolean isAlmostAPalindrome(String s) {
		int left=0,right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return validSubPalindrome(s,left+1,right)||validSubPalindrome(s,left,right-1);
			}
			left++;
			right--;
			
		}
		return true;
	}

	private static boolean validSubPalindrome(String s, int left, int right) {
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	}


