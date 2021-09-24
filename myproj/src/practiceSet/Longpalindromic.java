package practiceSet;

public class Longpalindromic {
	
	    public String longestPalindrome(String s) {
	    if(s.length() == 1){
	            return s;
	        }
	        String word1= null;
	        String word2= null;
	        String longestWord = null;
	        String result = "";
	          char[] arr= s.toCharArray();
	        for(int i = 0;i < s.length(); i++) {
	             word1 = helper(s, arr,  i, i);
	          //   System.out.println(word1);
	             word2 = helper(s, arr,i , i+1);
	            // System.out.println(word2);
	             if(word1.length() >= word2.length()) {
	                 longestWord = word1;
	             } else {
	                 longestWord = word2;

	             }

	             if(longestWord.length() >= result.length()) {
	                 result = longestWord;
	             }
	        }



	        return result;
	    }

	    public String helper(String s, char[] arr,int start, int end) {
	      System.out.println(start+ " " + end);
	            while (start >= 0 && end < arr.length && arr[start] == arr[end] ) {
	                start--;
	                end++;
	            }
	            return s.substring(start+1 ,end);
	    }
	
	public static void main(String[] args) {
		String s="baabad";
		Longpalindromic l= new  Longpalindromic();
		System.out.println(l.longestPalindrome(s));
	}
}

