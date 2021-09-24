package myproj;

import java.util.HashMap;
import java.util.HashSet;

public class Question {

	public static void main(String[] args) {
	String in = "I wonder how this text looks like backwards";
	String output="";
	for(int i=in.length()-1;i>0;i--) {
		
		output+=in.charAt(i);
	}
	System.out.print("Output : " + output);
	System.out.println("");
	
int[] a = {10, 20, 60, 30, 20, 40, 30, 60, 70, 80};
	
HashMap<Integer,Integer> ha= new HashMap<Integer,Integer>();
for(int i=0;i<a.length;i++) {
	
if(!ha.containsKey(a[i])) {
	ha.put(a[i], 1);
}
else ha.put(a[i], ha.get(a[i])+1);

}
for(int i=0;i<a.length;i++) {
	if(ha.get(a[i])!=-1) {
System.out.println(a[i] + " : " + ha.get(a[i]) );
ha.put(a[i],-1);
	}
}
}

	


}
/*Can you write a code to count the how many times the number is repeated in the list
sample_list = [10, 20, 60, 30, 20, 40, 30, 60, 70, 80]

Sample output:
10 - 1
20 - 2
60 - 2
30 - 2
40 - 1
70 - 1
80 - 1
*/

