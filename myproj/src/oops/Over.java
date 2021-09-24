package oops;

import java.util.List;

class Overload{
	public int run(int a,int b, int c) {
		return a+b+c;
	}
	public long run(int a,int b, int c) {
		return a+b+c;
	}
	public int Overload(int a,int b) {
		return a+b;
	}
	
	
}

public class Over extends Overload{

	public int run(int a,int b, int c) {
		return a+b-c;
	}
	public static void main(String[] args) {
		Overload o= new Overload ();
		System.out.println(o.Overload(3, 4));
		
		System.out.println(o.run(3, 4,4));
		String s="hgfdhfdhkjfhd87987dfjdkjfkdjfsaiemnvoiamcoa";
		String[] ss= s.split("\\s").filter;
	String a=	s.replaceAll("[aeiou]", "\\$");
	a=	a.replaceAll("[0-9]", "0");
		System.out.println(a);
	}

}
