package myproj;

public class Question2 {

	public static void main(String[] args) {

		//shifting pointers
		int [] arr= new int[]{4,8,1,2,3,9};
		int max =maxAreaa(arr);
		System.out.println("max area is :"+ max);
		
	}

	private static int maxAreaa(int[] arr) {
		int p1=0;
		int p2=arr.length-1;
		int maxArea=0;
		while(p1<p2) {
			int height=Math.min(arr[p1], arr[p2]);
			int width=p2-p1;
			int area=height*width;
			maxArea=Math.max(maxArea, area);
			if(arr[p1]<=arr[p2]) {
				
				p1++;
			}else {
				p2--;
			}
			
		}
		return maxArea;
	}

}
