package myproj;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	//Reading no of coins
		System.out.print("Enter no of Coins: ");
		int noOfCoins= sc.nextInt();
		
		int heads=0;
	//For loop for checking if it going to turn heads or tail for each number till noOfCoins	
		for(int i=1;i<=noOfCoins;i++) {
			int count=0;
	//For loop for checking no of factors of the number.		
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					
				}
			}
	//Even no of factors indicate it is going to turn heads and increment counter.		
			if(count%2==0) {
				heads++;
			}
			
		}
		System.out.println("No of heads: "+ heads);
		sc.close();
	}

}
