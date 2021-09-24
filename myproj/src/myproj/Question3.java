package myproj;

public class Question3 {

	public static void main(String[] args) {

int[] arr=new int[] {0,1,0,2,1,0,3,1,0,1,2};
int waterTotal=trappedWater(arr);
System.out.print("Max water trapped:" + waterTotal);
	}

	private static int trappedWater(int[] arr) {
		// TODO Auto-generated method stub
		int total=0;
		int left=0;
		int right=arr.length-1;
		int maxLeft=0,maxRight=0;
		
		while(left<right) {
			if(arr[left]<=arr[right]) {
				if(arr[left]>maxLeft) {
					maxLeft=arr[left];
				}else {
					total+=maxLeft-arr[left];
				}
				left++;
			}else {
				if(arr[right]>=maxRight) {
					maxRight=arr[right];
				}else {
					total+=maxRight-arr[right];
				}
				right--;
				
			}
			
		}
		
		return total;
	}

}
