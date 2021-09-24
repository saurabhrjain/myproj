package practiceSet;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		int[] arr= {22,43,5,33,54,34,65,5,3};
		
		sortPQ(arr);
		print(arr);
	}

	private static void print(int[] arr) {
		for(int a:arr) {

System.out.println(a+" ");
		}
		
	}

	private static void sortPQ(int[] arr) {
		PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
		for(int a:arr) {
			q.add(a);
			q.offer(3);
		}
		int i=0;
		while(!q.isEmpty()) {
			arr[i]=q.poll();
			i++;
		}
	}

}
