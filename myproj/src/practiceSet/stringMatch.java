package practiceSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringMatch {

	public static void main(String[] args) {
		String[] l1 = {"aaa", "a", "xyz"};
		        String m= "a" ;
for(String str:l1) {
	if(str.equals(m)) {
		   System.out.println(str.equals(m) );
	}
	
}

String input="jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.";
Pattern p = Pattern.compile("\\b[A-Za-z?.!,-]+\\b");
	Matcher matcher = p.matcher(input);
	Set<String> emails = new HashSet<String>();
	while(matcher.find()) {
	  emails.add(matcher.group());
	}
	System.out.print(emails );
	
	String in="cat cat dog cat hen hen";
			String[] s=in.split("\\s");
	System.out.println(s.length);	
	HashMap<String,Integer> hp=new HashMap<>();
	for(int i=0;i<s.length;i++) {
		if(!hp.containsKey(s[i])) {
			hp.put(s[i], 1);
		}else {
			hp.put(s[i], hp.get(s[i])+1);
		}
	}
	Set<String> keys = hp.keySet();
	//print all the keys 
	for (String key : keys) {
	System.out.println(key+hp.get(key));
	}
	for(int j=0;j<s.length;j++) {
		System.out.println(hp.values());
	}
	
	}

}
