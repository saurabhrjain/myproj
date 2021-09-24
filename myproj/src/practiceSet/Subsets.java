package practiceSet;

import java.util.ArrayList;

public class Subsets {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();	
		list.add(1);
		list.add(2);
		list.add(3);
	
		
	
	ArrayList<ArrayList<Integer>> llist = new ArrayList<>();
	
	llist=subsets(list);
	
	print(llist);
	}

	private static void print(ArrayList<ArrayList<Integer>> llist) {
		for(int i=0;i<llist.size();i++) {
			System.out.print("[ ");
			for(int j=0;j<llist.get(i).size();j++) {
				
				System.out.print(llist.get(i).get(j)+" ");
			}
			System.out.print(" ]");
			System.out.println("");
		}
	
	}

	private static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> list) {
	int size=list.size();
	int subsetNum=(1<<size);
	ArrayList<ArrayList<Integer>> allSubsets= new ArrayList<>();
	for(int subsetMask=0;subsetMask<subsetNum;subsetMask++) {
		ArrayList<Integer> subset= new ArrayList<>();
		for(int i=0;i<size;++i) {
			if((subsetMask &(1<<i))!=0) {
				subset.add(list.get(i));
			}
		}
	allSubsets.add(subset);
	
	}
	
		return allSubsets;
	}

}
