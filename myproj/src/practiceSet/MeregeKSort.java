package practiceSet;

import java.util.ArrayList;
import java.util.PriorityQueue;



public class MeregeKSort {
	
	
	public static class Pair implements Comparable<Pair>{
		
		int li;
		int di;
		int val;
		Pair(int li,int di,int val){
			this.di=di;
			this.li=li;
			this.val=val;
		}
		
		public int compareTo(Pair o) {
			
			return this.val-o.val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{2,5,7},{6,7,22,33,45},{22,47,67,88}};
		ArrayList<Integer> Sorted=mergKsort(arr);
		System.out.println(Sorted);
	}

	private static ArrayList<Integer> mergKsort(int[][] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> rv = new ArrayList<>();
		PriorityQueue<Pair> pq= new PriorityQueue<>();
				
		for (int i=0;i<arr.length;i++) {
		Pair p = new Pair(i,0,arr[i][0]);
			pq.add(p);
			
		}
		
		while(pq.size()>0) {
			Pair p=pq.remove();
			rv.add(p.val);
			p.di++;
			if(p.di<arr[p.li].length) {
				p.val=arr[p.li][p.di];
				pq.add(p);
			}
		}
		return rv;

	}

}
